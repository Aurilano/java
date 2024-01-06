package cursoJava.basico;
/*
 * Classe explica~]ao  dos operadores
 * 
 * versao 1.0
 * 
 * autor: Aurilano
 * */
public class Operadores {

	public static void main(String[] args) {
		
		int numero1=10 ,numero2=8; 
		/*
		// Operadores aritméticos + - * / %
		int resultado1 = numero1 + numero2;
		System.out.println(resultado1);
		
		int resultado2 = numero1 - numero2;
		System.out.println(resultado2);
		
		int resultado3 = numero1 * numero2;
		System.out.println(resultado3);
		
		//Foi preciso fazer um "cast(double)", pois as variáveis numero1 e numero2, são do tipo int 
		double resultado4 = (double)numero1 / numero2;
		System.out.println(resultado4);
		 
		int resultado5 = numero1 % numero2;
		System.out.println(resultado5);
		*/
		
		// Operadores de incremento  
		// "numero1 = numero1 + 1    ou    numero1++" da o mesmo resultado 
		
		// pos incremento -> Primeiro executa a linha de código e depois incremneta
		System.out.println(numero1++); // não imprimi nada, só incrementa
		System.out.println(numero1);  // imprimi a variável pra comprovar que incrementou
				
		// pré incremento -> primeiro incrementa depois executa a linha de código
		System.out.println(++numero1); // é 11
		
		System.out.println(numero1+=10);
		
		System.out.println(numero1*=3);
		
		System.out.println(numero1/=4);
		
		
		
		
		
		
		
		
		
		

	}

}
