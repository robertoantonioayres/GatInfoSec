package br.com.robertoantonio.domain.monitoramento;

import br.com.robertoantonio.model.Log;
import br.com.robertoantonio.model.Monitoramento;

import java.util.List;

public interface MonitoramentoService {

    public void create(Monitoramento monitoramento);

    public Monitoramento findById(Long id);

    public List<Monitoramento> findAll();

}
