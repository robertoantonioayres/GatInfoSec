package br.com.robertoantonio.domain.log;

import br.com.robertoantonio.model.Log;
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
public class LogServiceImpl implements LogService {

    private LogRepository logRepository;
    
    @Autowired
    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public void create(Log log) {
        logRepository.save(log);
    }

    @Override
    public List<Log> findAll() {
        List<Log> logList = logRepository.findAll();
        return logList;
    }

    @Override
    public Log findById(Long id) {
        return logRepository.getById(id);
    }

}
