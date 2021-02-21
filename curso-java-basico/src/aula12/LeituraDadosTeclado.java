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
		
		System.out.println("Possui animal de estimação?");
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Nome completo: " + nomeCompleto);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		if (temPet) {
			System.out.println("Possui animal de estimação");
		} else {
			System.out.println("Não possui animal de estimação");
		}
	}
}