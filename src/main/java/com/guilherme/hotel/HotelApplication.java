package com.guilherme.hotel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.guilherme.hotel.entities.Role;
import com.guilherme.hotel.repositories.RoleRepository;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}

	@Bean
    public CommandLineRunner demo(RoleRepository roleRepo) {
        return (args) -> {
            Role role = new Role();
            role.setName("ROLE_ADMIN");
            roleRepo.save(role);
        };
    }
	
}
