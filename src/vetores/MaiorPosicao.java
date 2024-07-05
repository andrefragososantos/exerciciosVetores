package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	private static final String MaiorPosicao = null;

	public static void main(String[] args) {
		
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
           o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
           considerando a primeira posição como 0 (zero).*/
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de números que você quer digitar: ");
		int n = entrada.nextInt();
		double maiorNumero = 0.0;
		int posicaoMaior = 0;
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = entrada.nextDouble();
			if (vect[i] > maiorNumero) {
				maiorNumero = vect[i];
				posicaoMaior = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + maiorNumero);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaior);
		
		
		
		
		entrada.close();

	}

}
