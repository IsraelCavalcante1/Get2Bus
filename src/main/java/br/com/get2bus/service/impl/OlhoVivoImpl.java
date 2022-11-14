package br.com.get2bus.service.impl;

import br.com.get2bus.response.LinhaResponse;
import br.com.get2bus.response.ParadaResponse;
import br.com.get2bus.response.PosicaoLinhaResponse;
import br.com.get2bus.service.OlhoVivoService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Collectors;

@Service
public class OlhoVivoImpl implements OlhoVivoService {

    private final String BASE_URL = "http://api.olhovivo.sptrans.com.br/v2.1/";
    RestTemplate template = new RestTemplate();
    HttpEntity<String> entity;

    @Override
    public void login(String token) {
        String url = BASE_URL + "Login/Autenticar?token=" + token;

        ResponseEntity<String> forEntity = template.postForEntity(url, HttpMethod.POST, String.class);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Cookie",forEntity.getHeaders().get("Set-Cookie").stream().collect(Collectors.joining(";")));
        this.entity = new HttpEntity<String>(headers);
    }

    @Override
    public LinhaResponse[] getLinhas(String param) {
        String url = BASE_URL + "Linha/Buscar?termosBusca=" + param;

        ResponseEntity<LinhaResponse[]> response = template.exchange(url, HttpMethod.GET, entity, LinhaResponse[].class);

        return response.getBody();
    }

    @Override
    public ParadaResponse[] getParadas(String param) {
        String url = BASE_URL + "Parada/Buscar?termosBusca=" + param;

        ResponseEntity<ParadaResponse[]> response = template.exchange(url, HttpMethod.GET, entity, ParadaResponse[].class);

        return response.getBody();
    }

    @Override
    public PosicaoLinhaResponse getPosicoes(Integer linha) {
        String url = BASE_URL + "Posicao/Linha?codigoLinha=" + linha;

        ResponseEntity<PosicaoLinhaResponse> response = template.exchange(url, HttpMethod.GET, entity, PosicaoLinhaResponse.class);

        return response.getBody();
    }
}
