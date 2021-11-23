package br.com.robertoantonio.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "monitoramento")
public class Monitoramento extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqmonitoramento")
    @SequenceGenerator(name = "seqmonitoramento", sequenceName = "id_seq_monitoramento", initialValue = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "criadoem")
    private Timestamp criadoem;

    @Column(name = "log")
    private String log;

    @Column(name = "sincronizado")
    private boolean sincronizado;


    public Monitoramento() {}

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
    public Timestamp getCriadoem() { return criadoem;    }

    public void setCriadoem(Timestamp criadoem) { this.criadoem = criadoem; }

    public String getLog() { return log;}

    public void setLog(String log) { this.log = log; }

    public boolean isSincronizado() { return sincronizado; }

    public void setSincronizado(boolean sincronizado) { this.sincronizado = sincronizado; }

}