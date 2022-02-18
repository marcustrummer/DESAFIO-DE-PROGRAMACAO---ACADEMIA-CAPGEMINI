package exerciciosTeste;



import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import implementations.Senha;

public class Ex002SenhaTest {
	
	  @Test
	  @DisplayName("✔ Verifica numero de caracteres necessarios para tornar a senha ` Ya3 ` forte!")
	  public void verifyPassword() {
		  
		  Senha senha = new Senha();
		  
		  final var input = "Ya3";
		  final var result = senha.verificaSenha(input);
		  Assertions.assertEquals(3, result);
	  }
	  
	  
	  @Test
	  @DisplayName("✔ Verifica numero de caracteres necessarios para tornar a senha ` Senha!1 ` forte!")
	  public void verifyPassword_2() {
		  
		  Senha senha = new Senha();
		  
		  final var input = "Senha!1";
		  final var result = senha.verificaSenha(input);
		  Assertions.assertEquals(0, result);
	  }
	  
	  @Test
	  @DisplayName("✔ Verifica numero de caracteres necessarios para tornar a senha ` Senhaaaaaa ` forte!")
	  public void verifyPassword_3() {
		  
		  Senha senha = new Senha();
		  
		  final var input = "Senhaaaaaa";
		  final var result = senha.verificaSenha(input);
		  Assertions.assertEquals(2, result);
	  }
	  
	  
	  @Test
	  @DisplayName("✔ Verifica se a senha contem o numero minimo de caracteres necessarios")
	  public void verifyPassword_4() {
		  
		  Senha senha = new Senha();
		  
		  final var input = "sennhaaa";
		  final var result = senha.verificaSenha(input);
		  Assertions.assertTrue(input.length() + result >= 6);
	  }
	  
	  
	  
	  
	  
	  
	  
	  

}
