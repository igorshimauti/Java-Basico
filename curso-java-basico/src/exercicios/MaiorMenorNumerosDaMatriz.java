package exercicios;

import java.util.Random;

public class MaiorMenorNumerosDaMatriz {

	public static void main(String[] args) {
		
		int[][] nums = new int[10][10];
		
		Random gerador = new Random();
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = gerador.nextInt();
			}
		}
		
		int maiorNumLinha5 = 0;
		int menorNumLinha5 = 0;
		int maiorNumColuna7 = 0;
		int menorNumColuna7 = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				if(i == 5) {
					if(maiorNumLinha5 == 0) {
						maiorNumLinha5 = nums[i][j];
					} else {
						if(maiorNumLinha5 < nums[i][j]) {
							maiorNumLinha5 = nums[i][j];
						}
					}

					if(menorNumLinha5 == 0) {
						menorNumLinha5 = nums[i][j];
					} else {
						if(menorNumLinha5 > nums[i][j]) {
							menorNumLinha5 = nums[i][j];
						}						
					}
				}
				
				if(j == 7) {
					if(maiorNumColuna7 == 0) {
						maiorNumColuna7 = nums[i][j];
					} else {
						if(maiorNumColuna7 < nums[i][j]) {
							maiorNumColuna7 = nums[i][j];
						}
					}

					if(menorNumColuna7 == 0) {
						menorNumColuna7 = nums[i][j];
					} else {
						if(menorNumColuna7 > nums[i][j]) {
							menorNumColuna7 = nums[i][j];
						}						
					}
				}
			}
		}
		
		System.out.println("Maior número da linha 5: " + maiorNumLinha5);
		System.out.println("Menor número da linha 5: " + menorNumLinha5);
		System.out.println("Maior número da coluna 7: " + maiorNumColuna7);
		System.out.println("Menor número da coluna 7: " + menorNumColuna7);
	}
}