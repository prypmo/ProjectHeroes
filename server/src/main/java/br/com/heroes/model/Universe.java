package br.com.heroes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "universe")
public class Universe {

    @Id
    @GeneratedValue
    private Long id;
    private String nomeUniverso;

    public Universe ()
    {}

    public Universe (String nomeUniverso)
    {
        //this.setId(id);
        this.setNomeUniverso(nomeUniverso);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeUniverso() {
        return nomeUniverso;
    }

    public void setNomeUniverso(String nomeUniverso) {
        this.nomeUniverso = nomeUniverso;
    }
}
