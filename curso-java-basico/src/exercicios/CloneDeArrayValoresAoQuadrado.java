package exercicios;

public class CloneDeArrayValoresAoQuadrado {

	public static void main(String[] args) {
		
		int[] numerosA = new int[15];
		numerosA[0] = 1;
		numerosA[1] = 2;
		numerosA[2] = 3;
		numerosA[3] = 4;
		numerosA[4] = 5;
		numerosA[5] = 6;
		numerosA[6] = 7;
		numerosA[7] = 8;
		numerosA[8] = 9;
		numerosA[9] = 10;
		numerosA[10] = 11;
		numerosA[11] = 12;
		numerosA[12] = 13;
		numerosA[13] = 14;
		numerosA[14] = 15;
		
		int[] numerosB = new int[15];
		for (int i = 0; i < numerosA.length; i++) {
			numerosB[i] = numerosA[i] * numerosA[i];
		}
		
		for (int i = 0; i < numerosA.length; i++) {
			System.out.println("A = " + numerosA[i] + " ; B = " + numerosB[i]);
		}
	}
}