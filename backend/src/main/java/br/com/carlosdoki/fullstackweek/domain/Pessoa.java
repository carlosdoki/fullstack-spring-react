package br.com.carlosdoki.fullstackweek.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Integer idade;
    private String dataNascimento;
    private Boolean isVacinada;

    @ManyToOne
    @JoinColumn(name = "codigo_grupo_prioridade")
    private GrupoPrioridades grupo;

    public Long getCodigo() {
        return this.codigo;
    }

    public Boolean getIsVacinada() {
        return isVacinada;
    }

    public void setIsVacinada(Boolean isVacinada) {
        this.isVacinada = isVacinada;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(codigo, pessoa.codigo) && Objects.equals(nome, pessoa.nome)
                && Objects.equals(cpf, pessoa.cpf) && Objects.equals(telefone, pessoa.telefone)
                && Objects.equals(email, pessoa.email) && Objects.equals(idade, pessoa.idade)
                && Objects.equals(dataNascimento, pessoa.dataNascimento)
                && Objects.equals(isVacinada, pessoa.isVacinada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, cpf, telefone, email, idade, dataNascimento, isVacinada);
    }
}
