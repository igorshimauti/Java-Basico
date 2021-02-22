package exercicios;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		float numero1 = scan.nextFloat();
		
		System.out.print("Digite o segundo n�mero: ");
		float numero2 = scan.nextFloat();
		
		System.out.print("Digite uma das opera��es (+ ; - ; * ; / ; %): ");
		String operador = scan.next();
		
		switch (operador) {
			case "+": System.out.println(numero1 + " + " + numero2 + " = " + (numero1+numero2)); break;
			case "-": System.out.println(numero1 + " - " + numero2 + " = " + (numero1-numero2)); break;
			case "*": System.out.println(numero1 + " * " + numero2 + " = " + (numero1*numero2)); break;
			case "/": System.out.println(numero1 + " / " + numero2 + " = " + (numero1/numero2)); break;
			case "%": System.out.println("O resto da divis�o de " + numero1 + " por " + numero2 + " � " + (numero1%numero2)); break;
			default: System.out.println("Opera��o desconhecida!");
		}
		
		
		
		scan.close();
	}
}