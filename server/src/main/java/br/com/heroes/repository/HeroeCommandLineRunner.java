package br.com.heroes.repository;

import br.com.heroes.model.Heroe;
import br.com.heroes.model.Power;
import br.com.heroes.model.Universe;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class HeroeCommandLineRunner implements CommandLineRunner {

    private final HeroeRepository repository;
    private final UniverseRepository universeRepository;
    private final PowerRepository powerRepository;

    public HeroeCommandLineRunner(HeroeRepository repository, UniverseRepository universeRepository, PowerRepository powerRepository) {
        this.repository = repository;
        this.powerRepository = powerRepository;
        this.universeRepository = universeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Power> poderes = new ArrayList<Power>();

        poderes.add(new Power("Voar"));
        poderes.add(new Power("Força"));
        poderes.forEach(power -> powerRepository.save(power));

        Universe eyComics = new Universe("EY Comics");
        universeRepository.save(eyComics);
        Universe traineeComics = new Universe("Trainee Comics");
        universeRepository.save(traineeComics);

        repository.save(new Heroe((long) 1, "Capitã Ernest", LocalDateTime.now(),
                eyComics, poderes));
        repository.save(new Heroe((long) 2, "Homem Young", LocalDateTime.now(),
                traineeComics, poderes));

        repository.findAll().forEach(System.out::println);

    }
}
