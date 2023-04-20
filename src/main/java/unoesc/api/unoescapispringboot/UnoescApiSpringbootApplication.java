package unoesc.api.unoescapispringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import unoesc.api.unoescapispringboot.controller.AvailableController;
import unoesc.api.unoescapispringboot.entities.AvailableDTO;

@SpringBootApplication
public class UnoescApiSpringbootApplication {


	public static void main(String[] args) {
		SpringApplication.run(UnoescApiSpringbootApplication.class, args);
		
		AvailableController availableController =  new AvailableController();
		
		ResponseEntity<AvailableDTO> response =  availableController.getAvailable();
		
	
	}

}
