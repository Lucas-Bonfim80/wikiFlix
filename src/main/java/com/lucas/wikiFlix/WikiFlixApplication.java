package com.lucas.wikiFlix;

import com.lucas.wikiFlix.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WikiFlixApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WikiFlixApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Main main = new Main();
        main.exibeMenu();



    }
}
