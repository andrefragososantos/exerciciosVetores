package vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
         * - Imprimir todos os elementos do vetor
         * - Mostrar na tela a soma e a média dos elementos do vetor.
        */
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos números você quer digitar? ");
		int n = entrada.nextInt();
		double soma = 0.0;
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			vect[i] = entrada.nextDouble();
		}
		System.out.println("Numeros: ");
		for (int i = 0; i < n; i++) {
			soma += vect[i];
			System.out.println(vect[i]);
		}
		System.out.println("A soma dos números é " + soma);
		double media = soma / n;
		System.out.println("A média dos números é " + media);
		
		
		
		
		
		entrada.close();

	}

}
