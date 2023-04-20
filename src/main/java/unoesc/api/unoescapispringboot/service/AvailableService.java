package unoesc.api.unoescapispringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import unoesc.api.unoescapispringboot.entities.AvailableDTO;

@Service
public class AvailableService {

    @Autowired
    private RestTemplate restTemplate;

    public AvailableDTO getAvailable() {
        ResponseEntity<AvailableDTO> response = restTemplate.getForEntity(
                "https://brapi.dev/api/available",
                AvailableDTO.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            throw new RuntimeException("Não foi possível obter a lista de ações disponíveis");
        }
    }
}