package br.com.get2bus.controller;

import br.com.get2bus.response.LinhaResponse;
import br.com.get2bus.response.PosicaoLinhaResponse;
import br.com.get2bus.service.OlhoVivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/olho-vivo")
public class OlhoVivoController {

    private final OlhoVivoService service;

    @Autowired
    public OlhoVivoController(OlhoVivoService service) {
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<?> login(@RequestParam(name = "token") String token){
        service.login(token);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> getLinhas(@RequestParam(name = "linha") String linha){
        LinhaResponse[] response = service.getLinhas(linha);
        return new  ResponseEntity<LinhaResponse[]>(response, HttpStatus.OK);
    }

    @GetMapping("posicao/veiculos/linha")
    public ResponseEntity<?> getPosicao(@RequestParam(name = "linha") Integer linha){
        PosicaoLinhaResponse response = service.getPosicoes(linha);
        return new  ResponseEntity<PosicaoLinhaResponse>(response, HttpStatus.OK);
    }
}
