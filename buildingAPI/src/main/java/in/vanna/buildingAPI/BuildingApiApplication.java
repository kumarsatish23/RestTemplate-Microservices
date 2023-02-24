package in.vanna.buildingAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
@OpenAPIDefinition
@SpringBootApplication
public class BuildingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildingApiApplication.class, args);
	}
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
