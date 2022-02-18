package exerciciosTeste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import implementations.Escada;

public class Ex001EscadaTest {
	

	 
	  @Test
	  @DisplayName("✔ Verifica a escada de lista de strings!")
	  public void verifyEscada() {
		  
		  Escada escada = new Escada();
		  
		  List<String> teste = new ArrayList<>();
		  teste.add("      ");
		  teste.add("     *");
		  teste.add("    **");
		  teste.add("   ***");
		  teste.add("  ****");
		  teste.add(" *****");
		  teste.add("******");
		  
		  final var input = 6;
		  final var result = escada.imprimeEscada(input);
		  Assertions.assertTrue(teste.equals(result));
		//Verifica se o list teste esta exatamente igual ao result
	  }

	  @Test
	  @DisplayName("✔ Verifica se o indice do input coincide com o numero de * na ultimo String da list ")
	  public void verifyEscada_2() {
		  
		  Escada escada = new Escada();
		  
	    final var input = 7;
	    final var result = escada.imprimeEscada(input);
	    Assertions.assertEquals(result.lastIndexOf("*".repeat(input)), input); 
	 // Verifica se o indice do input coincide com o numero de * na ultimo String da list 
	  }

	  
	  
	  
}
