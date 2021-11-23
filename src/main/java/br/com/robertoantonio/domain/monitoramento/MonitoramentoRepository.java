package br.com.robertoantonio.domain.monitoramento;

import br.com.robertoantonio.model.Monitoramento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitoramentoRepository extends JpaRepository<Monitoramento, Long> {

}
