package implementations;

import java.util.Arrays;
import java.util.HashMap;

import exercicios.IEx003Anagram;

public class Anagrama implements IEx003Anagram{

	
	
	/**
	 * Metodo utilizado para identificar número de pares de substrings que são anagramas presentes na string passada por parametro
	 * @author Marcus Trummer
	 * 
	 * @param s  string qualquer para identificar os anagramas presentes
	 * @return Retorna o numero de anagramas presente na string s
	 */
	@Override
	public int subString(String s) {
		 HashMap<String, Integer> map= new HashMap<>();
		  
	        for(int i = 0; i < s.length(); i++){
	            for(int j = i; j < s.length(); j++){
	                char[] valC = s.substring(i, j+1).toCharArray();
	                Arrays.sort(valC);
	                String val = new String(valC);
	                if (map.containsKey(val)) 
	                    map.put(val, map.get(val)+1);
	                else 
	                    map.put(val, 1);
	            }
	        }
	        int anagramPairCount = 0;
	        for(String key: map.keySet()){
	            int n = map.get(key);
	            anagramPairCount += (n * (n-1))/2;
	        }
	        System.out.println("O numero de anagramas presentes nessa string eh : " + anagramPairCount);
			return anagramPairCount;
	        	        
	}
}
