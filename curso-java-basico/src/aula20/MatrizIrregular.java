package aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas que serão entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			
			System.out.print("Digite a quantidade de filhos: ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j = 0; j < nomesFilhos[i][j].length(); j++) {
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		scan.close();
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			for(int j = 0; j < nomesFilhos[i][j].length(); j++) {
				System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos.");
			}
		}
	}
}