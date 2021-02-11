package com.app.ponto.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {

    private static final long serialVersionUID = -5L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Column(name = "nome", nullable = false)
    @Getter
    @Setter
    private String nome;

    @Column(name = "email", nullable = false)
    @Getter
    @Setter
    private String email;

    @Column(name = "senha", nullable = false)
    @Getter
    @Setter
    private String senha;

    @Column(name = "cpf", nullable = false)
    @Getter
    @Setter
    private String cpf;

    @ManyToOne(fetch = FetchType.EAGER)
    private Empresa empresa;

    public Funcionario() {

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                ", empresa=" + empresa +
                '}';
    }
}
