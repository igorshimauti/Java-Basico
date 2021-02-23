package exercicios;

public class CloneDeArrayValoresDobrados {

	public static void main(String[] args) {
		
		int[] numerosA = new int[8];
		numerosA[0] = 1;
		numerosA[1] = 2;
		numerosA[2] = 3;
		numerosA[3] = 4;
		numerosA[4] = 5;
		numerosA[5] = 6;
		numerosA[6] = 7;
		numerosA[7] = 8;
		
		int[] numerosB = new int[8];
		for (int i = 0; i < numerosA.length; i++) {
			numerosB[i] = numerosA[i] * 2;
		}
		
		for (int i = 0; i < numerosA.length; i++) {
			System.out.println("A = " + numerosA[i] + " ; B = " + numerosB[i]);
		}
	}
}