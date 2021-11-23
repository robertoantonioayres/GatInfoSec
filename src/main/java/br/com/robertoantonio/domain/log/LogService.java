package br.com.robertoantonio.domain.log;

import br.com.robertoantonio.model.Log;

import java.util.List;

public interface LogService {

    public void create(Log log);

    public Log findById(Long id);

    public List<Log> findAll();

}
