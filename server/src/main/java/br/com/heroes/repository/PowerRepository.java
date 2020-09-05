package br.com.heroes.repository;

import br.com.heroes.model.Power;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PowerRepository extends JpaRepository<Power, Long> {
}
