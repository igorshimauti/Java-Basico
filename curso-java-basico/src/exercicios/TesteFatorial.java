package exercicios;

import java.util.Scanner;

public class TesteFatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Fatorial fatorial = new Fatorial();
		System.out.print("Digite um número inteiro: ");
		fatorial.setNumero(scan.nextInt());
		int resultado = fatorial.calcularFatorial();
		System.out.println("Fatorial = " + resultado);
		scan.close();
	}
}