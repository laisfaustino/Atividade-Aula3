package atividade03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int idade,sexo,genero=0,esporte,contador=0,futebolFeminino=0,maiores18Voleibol=0,gamesTNBF=0;
		char continua = 'S';
		
		while(continua == 'S') {
		System.out.println("Digite sua idade:");
		idade= leia.nextInt();
		
		do {
			
		System.out.println("Digite o sexo (1-m/2-F/3-T/4-NB:)");
		sexo= leia.nextInt();
		
		}while(sexo < 1 || sexo > 4);
		
		if(sexo ==3 || sexo == 4) {
			System.out.println("Digite o sexo (1-m/2-F/3-T/4-NB:");
			genero= leia.nextInt();
		}
		
		System.out.println("Digite o seu esporte (1-futebol/2-voleibol/3-basquete/4-Games:)");
		esporte= leia.nextInt();
		
		contador ++;
		
		if(sexo == 2 && esporte == 1)
			futebolFeminino ++;
		
		if(sexo >= 18 && esporte == 2)
			maiores18Voleibol ++;
		
		if((sexo == 3 || sexo == 4)&& genero == 2 && esporte ==4)
			gamesTNBF ++;
		
		genero =0;
		
		System.out.println("Deseja continuar: (s/n)");
		continua= leia.next().toUpperCase().charAt(0);
	}
		System.out.println("Total de Fichas preenchidas:" + contador);
		System.out.println("Total de Pessoas do sexo feminino que gostam de futebol:" + futebolFeminino);
		System.out.println("Total de Pessoas maiores de 18anos que gostam de voleibol:" + maiores18Voleibol);
		System.out.println("Total de Pessoas do Trans e não binarias que se identificam com gênero feminino e gotam de games:" + gamesTNBF);
}
}
