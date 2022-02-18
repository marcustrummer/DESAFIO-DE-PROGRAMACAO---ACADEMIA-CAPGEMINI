package exerciciosTeste;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import implementations.Anagrama;

public class Ex003AnagramTest {

	@Test
	@DisplayName("✔ Verifica quantidade de anagramas presente em ` ovo ` !")
	public void verifyAnagram() {

		Anagrama anagram = new Anagrama();

		final var input = "ovo";
		final var result = anagram.subString(input);
		Assertions.assertEquals(2, result);
	}

	@Test
	@DisplayName("✔ Verifica quantidade de anagramas presente em ` ifailuhkqq ` !")
	public void verifyAnagram_2() {

		Anagrama anagram = new Anagrama();

		final var input = "ifailuhkqq";
		final var result = anagram.subString(input);
		Assertions.assertEquals(3, result);
	}

	@Test
	@DisplayName("✔ Verifica quantidade de anagramas presente em ` coco ` !")
	public void verifyAnagram_3() {

		Anagrama anagram = new Anagrama();

		final var input = "coco";
		final var result = anagram.subString(input);
		Assertions.assertEquals(5, result);
	}
}
