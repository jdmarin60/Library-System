package com.librarysystem;

import com.librarysystem.config.JWTTokenProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class LibrarySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarySystemApplication.class, args);
    }

}
