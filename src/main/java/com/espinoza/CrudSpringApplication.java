package com.espinoza;

import com.espinoza.entidad.Estudiante;
import com.espinoza.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringApplication.class, args);
    }

    @Autowired
    private EstudianteRepository repository;

    @Override
    public void run(String... args) throws Exception {
        //Estudiante estudiante1 = new Estudiante("miguel","espinoza","miguel@gmail.com");
        //repository.save(estudiante1);

        //Estudiante estudiante2=new Estudiante("andres","carrillo","andre@gmail.com");
        //repository.save(estudiante2);
    }
}
