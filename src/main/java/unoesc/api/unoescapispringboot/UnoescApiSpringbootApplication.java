package unoesc.api.unoescapispringboot;

import java.io.IOException;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import unoesc.api.unoescapispringboot.controller.AvailableController;

@SpringBootApplication
public class UnoescApiSpringbootApplication {


	public static void main(String[] args) {
		SpringApplication.run(UnoescApiSpringbootApplication.class, args);
		
		AvailableController availableController =  new AvailableController();
		
		try {
			AcaoDTO response =  availableController.getAvailable();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
