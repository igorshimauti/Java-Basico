package exercicios;

public class CloneDeArray {

	public static void main(String[] args) {
		
		int[] numerosA = new int[5];
		numerosA[0] = 326;
		numerosA[1] = 3165;
		numerosA[2] = 6463;
		numerosA[3] = 681;
		numerosA[4] = 6516;
		
		int[] numerosB = new int[5];
		for (int i = 0; i < numerosA.length; i++) {
			numerosB[i] = numerosA[i];
		}
		
		for (int i = 0; i < numerosA.length; i++) {
			System.out.println("A = " + numerosA[i]);
			System.out.println("B = " + numerosB[i]);
		}
	}
}