package br.com.get2bus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario extends Endereco {
    private String nome;
    private Endereco enderecoAtual;
    private List<Endereco> enderecosFavoritos;
    private List<LinhaDeOnibus> linhasDeOnibus;
}

