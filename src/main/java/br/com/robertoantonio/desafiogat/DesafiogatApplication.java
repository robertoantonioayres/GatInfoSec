package br.com.robertoantonio.desafiogat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.com.robertoantonio.model")
@ComponentScan(basePackages = {"br.com.robertoantonio"})
@EnableJpaRepositories("br.com.robertoantonio.domain")
public class DesafiogatApplication {
	public static void main(String[] args) {
		SpringApplication.run(DesafiogatApplication.class, args);
	}
}
