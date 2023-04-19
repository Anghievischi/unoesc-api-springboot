package unoesc.api.unoescapispringboot.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class QuoteController {

    @Autowired
    private HttpClient httpClient;

    @GetMapping("/quote/{symbol}")
    public ResponseEntity<String> getQuote(@PathVariable String symbol) throws IOException, InterruptedException {
        String url = String.format("https://brapi.dev/api/quote/%s", symbol);
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .GET()
            .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        
        return ResponseEntity.ok(response.body());
    }
}