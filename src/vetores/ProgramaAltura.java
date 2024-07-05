package vetores;

import java.util.Locale;
import java.util.Scanner;

import entidades.Altura;

public class ProgramaAltura {

	public static void main(String[] args) {
	
		/*Fazer um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na
		  tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		  bem como os nomes dessas pessoas caso houver.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número de pessoas: ");
		int n = entrada.nextInt();
		double somaAltura = 0.0;
		int menorDezersseis = 0;
		
		Altura[] vect = new Altura[n];
		
		for (int i = 0; i < n; i++) {
			entrada.nextLine();
			System.out.printf("Insira os dados da %dª pessoa: %n", i + 1);
			System.out.print("Nome: ");
			String nome = entrada.nextLine();
			System.out.print("Idade: ");
			int idade = entrada.nextInt();
			System.out.print("Altura: ");
			double altura = entrada.nextDouble();
			
			vect[i] = new Altura(nome, idade, altura);
			
			somaAltura += vect[i].getAltura();
		}
		double mediaAltura = somaAltura / n;
		System.out.println();
		System.out.printf("Altura média = %.2f%n", mediaAltura);
		
		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				menorDezersseis++;
			}
		}
		double porcentagem = menorDezersseis * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		
		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}	
		}
		
		
		entrada.close();

	}

}
