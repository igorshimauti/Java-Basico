package exercicios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o número de iterações desejadas para a sequencia fibonacci: ");
		int qtd = scan.nextInt();
		
		int numeroAtual = 1;
		int numeroAnterior = 0;
		int proximoNumero = 0;
		
		for (int i = 1; i<=qtd; i++) {
			numeroAnterior = numeroAtual;
			numeroAtual = proximoNumero;
			proximoNumero = numeroAnterior + numeroAtual;
			System.out.println(proximoNumero);
		}
		
		scan.close();
	}
}