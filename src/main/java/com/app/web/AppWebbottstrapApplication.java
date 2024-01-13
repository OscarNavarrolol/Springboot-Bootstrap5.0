package com.app.web;

import com.app.web.entities.Trabajador;
import com.app.web.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppWebbottstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppWebbottstrapApplication.class, args);

    }

}
