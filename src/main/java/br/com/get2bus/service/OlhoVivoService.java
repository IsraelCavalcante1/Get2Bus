package br.com.get2bus.service;

import br.com.get2bus.response.LinhaResponse;
import br.com.get2bus.response.ParadaResponse;
import br.com.get2bus.response.PosicaoLinhaResponse;

import javax.annotation.PostConstruct;


public interface OlhoVivoService {


    @PostConstruct
    void login(String token);

    LinhaResponse[] getLinhas(String param);

    ParadaResponse[] getParadas(String param);

    PosicaoLinhaResponse getPosicoes(Integer param);
}
