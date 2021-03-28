package br.com.carlosdoki.fullstackweek.repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.carlosdoki.fullstackweek.domain.GrupoPrioridades;

public interface GrupoPrioridadesRepository extends JpaRepository<GrupoPrioridades, Long> {

}
