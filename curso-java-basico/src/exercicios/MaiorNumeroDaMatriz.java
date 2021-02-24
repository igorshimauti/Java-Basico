package exercicios;

import java.util.Random;

public class MaiorNumeroDaMatriz {

	public static void main(String[] args) {
		
		int[][] numeros = new int[4][4];
		
		Random gerador = new Random();
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++ ) {
				numeros[i][j] = gerador.nextInt();
			}
		}
		
		int maiorNumero = 0;
		int posicaoi = 0;
		int posicaoj = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				if(maiorNumero < numeros[i][j]) {
					posicaoi = i;
					posicaoj = j;
					maiorNumero = numeros[i][j];
				}
			}
		}
		
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Linha: " + posicaoi);
		System.out.println("Coluna: " + posicaoj);
	}
}