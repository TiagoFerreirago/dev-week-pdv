package web.dio.dev.week;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server Url")})
@SpringBootApplication
public class SantanderDevWeekApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeekApplication.class, args);
	}

}
