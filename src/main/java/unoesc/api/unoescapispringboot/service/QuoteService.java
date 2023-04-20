package unoesc.api.unoescapispringboot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import unoesc.api.unoescapispringboot.entities.QuoteDTO;

@Service
public class QuoteService {

    private final RestTemplate restTemplate;
    private final String quoteEndpoint = "https://brapi.dev/api/quote/";

    public QuoteService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public QuoteDTO getQuote(String symbol) {
        QuoteDTO quoteDTO = restTemplate.getForObject(quoteEndpoint + symbol, QuoteDTO.class);
        return quoteDTO;
    }

}