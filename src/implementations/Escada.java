package implementations;

import java.util.ArrayList;
import java.util.List;

import exercicios.IEx001Escada;

public class Escada implements IEx001Escada {

	
	/**
	 * Metodo para imprimir escada de acordo com o numero de degraus passado por parametro
	 * @author Marcus Trummer
	 * 
	 * @param numDegraus numero de degraus para formacao da escada
	 * @return retorna uma list com a escada de strings 
	 * 
	 */
	@Override
	public List<String> imprimeEscada(int numDegraus) {

		List<String> escada = new ArrayList<>();

		for (int i = 0; i <= numDegraus; i++) {
			escada.add(" ".repeat(numDegraus - i) + "*".repeat(i)); // preenchera a lista com N -i espacos + i+1																	// estrelinhas em cada degrau da escada
		}
		
		for (String string : escada) {
			System.out.println(string);
		}

		
		return escada;
	}
	
	

}
