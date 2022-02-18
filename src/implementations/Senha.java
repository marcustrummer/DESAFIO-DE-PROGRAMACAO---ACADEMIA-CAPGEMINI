package implementations;



import exercicios.IEx002Senha;

public class Senha implements IEx002Senha{
	
	
	
	/**
	 * Metodo para validar se a senha:
	 * Possui no mínimo 6 caracteres.
	 * Contém no mínimo 1 digito.
	 * Contém no mínimo 1 letra em minúsculo.
	 * Contém no mínimo 1 letra em maiúsculo.
	 * Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

	 * @author Marcus Trummer.
	 * 
	 * @param senha string a ser validada.
	 * @return retorna o numero de caracteres necessarios para tornar a senha forte.
	 */
	@Override
	public int verificaSenha(String senha) {
		int temDigito = 0;
		int temEspecial = 0;
		int numCaracterePrecisa = 0; // NUMERO DE CARACTERES MINIMOS PARA TORNAR SENHA FORTE
		char[] verifica = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };

		for (int i = 0; i < senha.length(); i++) {
			if (senha.length() < 6) {
				numCaracterePrecisa = 6 - senha.length();
				return numCaracterePrecisa;
			} else {

				char caractere = senha.charAt(i);
				for (int j = 0; j < verifica.length; j++) {
					if (verifica[j] == caractere)
						temEspecial++;
				}
				if (Character.isDigit(caractere)) {
					temDigito++;
				}
			}
		}

		if (temDigito == 0) {
			// System.out.println("Senha deve possuir pelo menos 1 digito");
			numCaracterePrecisa++;
		}
		if (senha.toLowerCase() == senha) {
			// System.out.println("Senha deve conter ao menos 1 caractere maiusculo");
			numCaracterePrecisa++;

		}
		if (senha.toUpperCase() == senha) {
			// System.out.println("Senha deve conter ao menos 1 caractere minusculo");
			numCaracterePrecisa++;

		}

		if (temEspecial == 0) {
			// System.out.println("Senha deve conter um dos caracteres especiais (
			// !@#$%^&*()-+ ) ");
			numCaracterePrecisa++;
		}

		return numCaracterePrecisa;
	}
}
