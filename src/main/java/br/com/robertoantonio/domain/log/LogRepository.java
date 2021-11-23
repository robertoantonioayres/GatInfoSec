package br.com.robertoantonio.domain.log;

import br.com.robertoantonio.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {

}
