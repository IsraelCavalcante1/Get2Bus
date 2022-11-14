package br.com.get2bus;

import br.com.get2bus.model.LinhaDeOnibus;
import br.com.get2bus.model.Usuario;

public interface TempoAtePontoMaisProximoUseCase {

     int calcular(Usuario usuario, LinhaDeOnibus linhaDeOnibus);
}
