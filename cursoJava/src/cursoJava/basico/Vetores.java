package cursoJava.basico;

import java.util.ArrayList;

/*
 * Classe que especifica a criação de array
 * 
 * versão: 1.0
 * 
 * autor: Aurilano
 */
public class Vetores {

	public static void main(String[] args) {
		
		// Declaração de um  vetor vazio.
		int numeros[] = new int[5];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		System.out.println(numeros[2]);		
		
		// Declaração de vetor com já com valores 
		char consoantes[] = {'b','c','d','f','g' };

		System.out.println(consoantes[3]);
		
		// Usando array list
		ArrayList<Integer> pares =  new ArrayList<>();
		
		pares.add(2);
		pares.add(6);
		pares.add(1, 4);
		pares.add(0,12);
		pares.add(24);
		pares.add(10);
		pares.add(8);
		pares.sort(null);
		
		System.out.println(pares.get(0));
		
		
		/*
		 * double a=14, b=5, c=a%b ;
		
		System.out.println(c);
		*/
	}

}
