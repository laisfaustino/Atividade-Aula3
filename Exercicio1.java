package atividade3Entrega;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numeroInicial,numeroFinal;
		
		System.out.println("Qual é o inicio do intervalo:");
		numeroInicial= leia.nextInt();
		System.out.println("Informe o final do intervalo:");
		numeroFinal = leia.nextInt();
		
		if(numeroInicial > numeroFinal) {
			System.out.println("Intervalo é inválido:");
			System.exit(0);	
		}
		
		for(int contador = numeroInicial; contador<=numeroFinal;contador ++) {
				if (contador%3 ==0 && contador%5 ==0)
					System.out.println(contador + " é múltiplo 5 e 3");
	}
		

}}
