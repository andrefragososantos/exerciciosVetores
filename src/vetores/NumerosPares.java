package vetores;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
         *tela todos os números pares, e também a quantidade de números pares.
        */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quantos números você quer digitar: ");
		int n = entrada.nextInt();
		int qtdPares = 0; 
		
		int[] vect = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = entrada.nextInt();
			if (vect[i] % 2 == 0) {
				qtdPares++;
			}
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i]);
				System.out.print(" ");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + qtdPares);
		
		
		entrada.close();

	}

}
