package jokenpo;

import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		// criei duas vari�veis, sendo uma para jogador humano e outra para o computador
		int computador, jogador;
		Scanner teclado = new Scanner(System.in);

		// escrevo o nome do jogo e ecplico as regras
		System.out.println("__________(^^)JojenP� (^^D)__________");
		System.out.println("");
		System.out.println("Caso voc� n�o saiba,jokenp� � um jogo em que as pessoas utilizam as m�os");
		System.out.println("escolhendo entre pedra, papel e tesoura. E, funciona assim: ");
		System.out.println("*a tesoura corta o papel, mas quebra com a pedra;");
		System.out.println("*o papel embrulha a pedra, mas � cortado pela tesoura;");
		System.out.println("*a pedra quebra a tesoura e � embrulhada pelo papel;");
		System.out.println("Vamos jogar? ");
		System.out.println("Digite 0 para escolher Pedra");
		System.out.println("Digite 1 para escolher Tesoura");
		System.out.println("Digite 2 para escolher Papel");
		System.out.println("JoOoOoOOKenPOOOO!!!");
		System.out.println("");
		System.out.println("(Lembrando, digite apenas 0, 1 ou 2!) Qual � a op��o desejada?  ");
		System.out.println("");
		// para criar a l�gica do jogador, armazenar a op��o digitada
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
			System.out.println("Op��o inv�lida");
			break;
		}

		//para o computador foi utilizado a fun��o math.random para  escolher n�meros aleat�rios
		// particularidades: *3 para  trazer  tr�s n� aleat�rios, essa fun��o traz n� n]ao inteiros, 
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
			System.out.println("VOC� VENCEU.");					
		} else {
			System.out.println("VOC� PERDEU.");
		}
			}
		}
		}
