package com.br.ayrton.projetospring;

import com.br.ayrton.projetospring.domain.Categoria;
import com.br.ayrton.projetospring.repositories.CategoriaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProjetospringApplication implements CommandLineRunner {

    private CategoriaRepository categoriaRepository;

    public ProjetospringApplication(final CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjetospringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Escritório");

        categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
    }
}
