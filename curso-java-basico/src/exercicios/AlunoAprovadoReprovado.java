package exercicios;

import java.util.Scanner;

public class AlunoAprovadoReprovado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a nota do 1º bimestre: ");
		float nota1 = scan.nextFloat();
		
		System.out.print("Digite a nota do 2º bimestre: ");
		float nota2 = scan.nextFloat();
		
		System.out.print("Digite a nota do 3º bimestre: ");
		float nota3 = scan.nextFloat();
		
		System.out.print("Digite a nota do 4º bimestre: ");
		float nota4 = scan.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado");
		} else if (media > 5) {
			System.out.println("Aluno em recuperação");
		} else {
			System.out.println("Aluno reprovado");
		}
		
		scan.close();
	}
}