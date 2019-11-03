package com.helixleisure.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The Class BookingBossApplication.
 * 
 * @author munikumarchallagulla
 */
@SpringBootApplication
@EnableJpaRepositories
public class BookingBossApplication {
	
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(BookingBossApplication.class, args);
    }

}