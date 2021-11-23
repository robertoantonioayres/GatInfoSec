/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.robertoantonio.model;

import org.hibernate.annotations.BatchSize;

import javax.persistence.*;

/**
 * @author Roberto Ayres
 * @since 19/11/2021
 * @version 1.0.0
 */
@Entity
@Table(name = "log")
public class Log extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqlog")
    @SequenceGenerator(name = "seqlog", sequenceName = "id_seq_log", initialValue = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "log")
    private String log;


    public Log() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLog() { return log;}

    public void setLog(String log) { this.log = log; }

}
