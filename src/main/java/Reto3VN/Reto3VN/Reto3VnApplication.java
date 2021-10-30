package Reto3VN.Reto3VN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto3VN.Reto3VN.Modelo"})

public class Reto3VnApplication {

	public static void main(String[] args) {
		SpringApplication.run(Reto3VnApplication.class, args);
	}

}
