/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robertoantonio.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Roberto Ayres
 * @since 19/11/2021
 * @version 1.0.0
 */
@Entity
@Table(name = "email")
public class Email extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqemail")
    @SequenceGenerator(name = "seqemail", sequenceName = "id_seq_email", initialValue = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;


    @Column(name = "importante")
    private boolean importante;

    @Column(name = "data")
    private Timestamp data;


    public Email() {}

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isImportante() { return importante;}

    public void setImportante(boolean importante) { this.importante = importante; }

    public Timestamp getData() { return data; }

    public void setData(Timestamp data) { this.data = data; }

}
