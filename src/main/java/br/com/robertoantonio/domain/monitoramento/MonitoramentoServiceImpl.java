package br.com.robertoantonio.domain.monitoramento;

import br.com.robertoantonio.model.Log;
import br.com.robertoantonio.model.Monitoramento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Roberto Ayres
 * @since 20/11/2021
 * @version 1.0.0
 */
@Service
@Transactional
public class MonitoramentoServiceImpl implements MonitoramentoService {

    private MonitoramentoRepository monitoramentoRepository;
    
    @Autowired
    public MonitoramentoServiceImpl(MonitoramentoRepository monitoramentoRepository) {
        this.monitoramentoRepository = monitoramentoRepository;
    }

    @Override
    public void create(Monitoramento monitoramento) {
        monitoramentoRepository.save(monitoramento);
    }

    @Override
    public List<Monitoramento> findAll() {
        List<Monitoramento> monitoramentoList = monitoramentoRepository.findAll();
        return monitoramentoList;
    }

    @Override
    public Monitoramento findById(Long id) {
        return monitoramentoRepository.getById(id);
    }

}
