package br.com.heroes.controller;

import br.com.heroes.model.Heroe;
import br.com.heroes.repository.HeroeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HeroeController {
    private HeroeRepository heroeRepository;

    public HeroeController(HeroeRepository repository) {
        this.heroeRepository = repository;
    }

    @GetMapping("/heroe")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Heroe> getAllHeroes() {
        return heroeRepository.findAll();
    }

}





