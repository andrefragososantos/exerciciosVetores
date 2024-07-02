package vetores;

import java.util.Locale;
import java.util.Scanner;

public class aplicaçãoNegativos {

	public static void main(String[] args) {
		
		/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
         e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos números você quer digitar?  ");
		int n = entrada.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			vect[i] = entrada.nextInt();
			}
		System.out.println("Numeros negativos: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		entrada.close();

	}

}
