package br.com.heroes.repository;

import br.com.heroes.model.Heroe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HeroeRepository extends JpaRepository<Heroe, Long> {
}
