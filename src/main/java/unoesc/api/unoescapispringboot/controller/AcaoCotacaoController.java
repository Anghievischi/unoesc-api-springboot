package unoesc.api.unoescapispringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unoesc.api.unoescapispringboot.entities.AcaoDTO;
import unoesc.api.unoescapispringboot.entities.CotacaoDTO;
import unoesc.api.unoescapispringboot.service.AcaoCotacaoService;

@RestController
@RequestMapping("/api")
public class AcaoCotacaoController {

    @Autowired
    private AcaoCotacaoService acaoCotacaoService;

    @GetMapping("/acoes")
    public ResponseEntity<List<AcaoDTO>> getAcoes() {
        List<AcaoDTO> acoes = acaoCotacaoService.getAcoes();
        return ResponseEntity.ok(acoes);
    }

    @GetMapping("/cotacao/{simbolo}")
    public ResponseEntity<CotacaoDTO> getCotacao(@PathVariable String simbolo) {
        CotacaoDTO cotacao = acaoCotacaoService.getCotacao(simbolo);
        return ResponseEntity.ok(cotacao);
    }
}