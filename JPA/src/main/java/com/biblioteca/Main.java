package com.biblioteca;

import com.biblioteca.controller.cases.CaseMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication(scanBasePackages = "com.biblioteca")
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
        @Bean
        public CommandLineRunner run (CaseMenu caseMenu){
            return arg->{
                log.info("\uD83D\uDD25 ESTOU RODANDO AQUI \uD83D\uDD25");
                caseMenu
            }
        }

}