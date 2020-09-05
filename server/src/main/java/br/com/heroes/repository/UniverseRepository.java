package br.com.heroes.repository;

import br.com.heroes.model.Universe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniverseRepository extends JpaRepository<Universe, Long> {
}
