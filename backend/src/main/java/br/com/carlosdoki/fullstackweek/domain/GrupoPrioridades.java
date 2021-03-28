package br.com.carlosdoki.fullstackweek.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GrupoPrioridades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private String descricao;

    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GrupoPrioridades)) {
            return false;
        }
        GrupoPrioridades grupoPrioridades = (GrupoPrioridades) o;
        return Objects.equals(codigo, grupoPrioridades.codigo) && Objects.equals(nome, grupoPrioridades.nome)
                && Objects.equals(descricao, grupoPrioridades.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, descricao);
    }
}
