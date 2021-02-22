package exercicios;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float numero1 = scan.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float numero2 = scan.nextFloat();
		
		System.out.print("Digite uma das operações (+ ; - ; * ; / ; %): ");
		String operador = scan.next();
		
		switch (operador) {
			case "+": System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2)); break;
			case "-": System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2)); break;
			case "*": System.out.println(numero1 + " * " + numero2 + " = " + (numero1*numero2)); break;
			case "/": System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2)); break;
			case "%": System.out.println("O resto da divisão de " + numero1 + " por " + numero2 + " é " + (numero1%numero2)); break;
			default: System.out.println("Operação desconhecida!");
		}
		
		
		
		scan.close();
	}
}