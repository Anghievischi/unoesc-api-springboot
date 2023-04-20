package unoesc.api.unoescapispringboot.controller;

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