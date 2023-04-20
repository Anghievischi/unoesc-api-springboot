package unoesc.api.unoescapispringboot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unoesc.api.unoescapispringboot.entities.QuoteDTO;
import unoesc.api.unoescapispringboot.service.QuoteService;

@RestController
@RequestMapping("/api/quote")
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/{symbol}")
    public ResponseEntity<QuoteDTO> getQuote(@PathVariable String symbol) {
        QuoteDTO quoteDTO = quoteService.getQuote(symbol);
        return ResponseEntity.ok(quoteDTO);
    }

}




