package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		
		System.out.println("Digite sua altura");
		float altura = scan.nextFloat();
		
		System.out.println("Possui animal de estima��o?");
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Nome completo: " + nomeCompleto);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		if (temPet) {
			System.out.println("Possui animal de estima��o");
		} else {
			System.out.println("N�o possui animal de estima��o");
		}
	}
}