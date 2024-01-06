package cursoJava.basico;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 *  Classe desmostrativa  de variáveis e constantes 
 * 
 *  versão 01
 *  
 *  autor: Aurilano
 * */
public class VariaveisEconstantes {

	public static void main(String[] args) {
		// Criação de constantes
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		
		// criação de variáveis
		String nome="Sophia";
		
		int idade=9;
		
		double peso=46,altura=1.50;
		
		char sexo='f',cnh='b';
		
		boolean doadorOrgaos=true;
		
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Peso: "+peso);
		System.out.println("ALtura: "+altura);
		System.out.println("Sexo: "+sexo);
		System.out.println("Habilitação: "+cnh);
		System.out.println("Doador de orgãos: "+doadorOrgaos);
		
		System.out.println("Gravidade: "+ACELERACAO_GRAVIDADE_TERRA+" m/s2");
		
	}

}
