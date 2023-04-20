package unoesc.api.unoescapispringboot.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unoesc.api.unoescapispringboot.entities.AvailableDTO;
import unoesc.api.unoescapispringboot.entities.QuoteDTO;
import unoesc.api.unoescapispringboot.service.AvailableService;

@RestController
@RequestMapping("/api")
public class AvailableController {

    @Autowired
    private AvailableService availableService;

    @GetMapping("/available")
    public ResponseEntity<AvailableDTO> getAvailable() {
        AvailableDTO availableDTO = availableService.getAvailable();
        return ResponseEntity.ok(availableDTO);
    }

    public ResponseEntity<QuoteDTO> getQuote() {
        return null;
    }
}