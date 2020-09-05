package br.com.heroes.model;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "heroe")
public class Heroe {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private LocalDateTime dataCadastro = LocalDateTime.now();
    private Boolean ativo;
    @ManyToOne
    private Universe universo;
    @ManyToMany
    private List<Power> poderes = new ArrayList<>();

    public Heroe()
    {}

    public Heroe(Long id, String nome, LocalDateTime dataCadastro, Universe universo, List<Power> poderes)
    {
        this.setId(id);
        this.setNome(nome);
        this.setDataCadastro(dataCadastro);
        this.setAtivo(true);
        this.setUniverso(universo);
        this.setPoderes(poderes);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        ativo = ativo;
    }

    public Universe getUniverso() {
        return universo;
    }

    public void setUniverso(Universe universo) {
        this.universo = universo;
    }

    public List<Power> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Power> poderes) {
        this.poderes = poderes;
    }


}
