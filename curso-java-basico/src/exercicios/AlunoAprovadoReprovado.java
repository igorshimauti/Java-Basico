package exercicios;

import java.util.Scanner;

public class AlunoAprovadoReprovado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a nota do 1� bimestre: ");
		float nota1 = scan.nextFloat();
		
		System.out.print("Digite a nota do 2� bimestre: ");
		float nota2 = scan.nextFloat();
		
		System.out.print("Digite a nota do 3� bimestre: ");
		float nota3 = scan.nextFloat();
		
		System.out.print("Digite a nota do 4� bimestre: ");
		float nota4 = scan.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado");
		} else if (media > 5) {
			System.out.println("Aluno em recupera��o");
		} else {
			System.out.println("Aluno reprovado");
		}
		
		scan.close();
	}
}