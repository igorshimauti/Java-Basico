package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro.");
		int num = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + (i*num));
		}
		
		scan.close();
	}
}