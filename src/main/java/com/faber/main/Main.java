package com.faber.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author THIEN
 */
@SpringBootApplication
@EntityScan("com.faber.entities")
@ComponentScan("com.faber.*")
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    
}
