package br.com.heroes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "power")
public class Power {
    @Id
    @GeneratedValue
    private Long id;
    private String nomePoder;

    public Power()
    {}

    public Power(String nomePoder)
    {
        //this.setId(id);
        this.setNomePoder(nomePoder);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePoder() {
        return nomePoder;
    }

    public void setNomePoder(String nomePoder) {
        this.nomePoder = nomePoder;
    }
}
