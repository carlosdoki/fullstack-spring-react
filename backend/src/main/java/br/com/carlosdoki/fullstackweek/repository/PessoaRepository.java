package br.com.carlosdoki.fullstackweek.repository;

import javax.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.carlosdoki.fullstackweek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
