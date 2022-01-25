package jokenpo;

import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		// criei duas variáveis, sendo uma para jogador humano e outra para o computador
		int computador, jogador;
		Scanner teclado = new Scanner(System.in);

		// escrevo o nome do jogo e ecplico as regras
		System.out.println("__________(^^)JojenPô (^^D)__________");
		System.out.println("");
		System.out.println("Caso você não saiba,jokenpô é um jogo em que as pessoas utilizam as mãos");
		System.out.println("escolhendo entre pedra, papel e tesoura. E, funciona assim: ");
		System.out.println("*a tesoura corta o papel, mas quebra com a pedra;");
		System.out.println("*o papel embrulha a pedra, mas é cortado pela tesoura;");
		System.out.println("*a pedra quebra a tesoura e é embrulhada pelo papel;");
		System.out.println("Vamos jogar? ");
		System.out.println("Digite 0 para escolher Pedra");
		System.out.println("Digite 1 para escolher Tesoura");
		System.out.println("Digite 2 para escolher Papel");
		System.out.println("JoOoOoOOKenPOOOO!!!");
		System.out.println("");
		System.out.println("(Lembrando, digite apenas 0, 1 ou 2!) Qual é a opção desejada?  ");
		System.out.println("");
		// para criar a lógica do jogador, armazenar a opção digitada
		jogador = teclado.nextInt();
		switch (jogador) {
		case 0:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 1:
			System.out.println("Jogador escolheu Tesoura");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}

		//para o computador foi utilizado a função math.random para  escolher números aleatórios
		// particularidades: *3 para  trazer  três nº aleatórios, essa função traz nº n]ao inteiros, 
		//por isso a necessidade do int entre parenteses
		computador = (int) (Math.random() * 3);
		teclado.close();
		switch (computador) {
		case 0:
			System.out.println("Computador escolheu Pedra");
			break;
		case 1:
			System.out.println("Computador escolheu Tesoura");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		}
		
		if (jogador == computador) {
			System.out.println("EMPATE.");	
		} else {
			if ((jogador == 0 && computador == 1) || (jogador == 1 && computador == 2)|| (jogador == 2 && computador == 0)) {
			System.out.println("VOCÊ VENCEU.");					
		} else {
			System.out.println("VOCÊ PERDEU.");
		}
			}
		}
		}
