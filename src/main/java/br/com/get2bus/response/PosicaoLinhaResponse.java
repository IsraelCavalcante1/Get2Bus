package br.com.get2bus.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PosicaoLinhaResponse {
    private String hr;
    private List<VeiculosResponse> vs;
}
