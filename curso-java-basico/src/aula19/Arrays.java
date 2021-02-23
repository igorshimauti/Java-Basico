package aula19;

public class Arrays {

	public static void main(String[] args) {

		double[] temperaturaDias = new double[365];
		temperaturaDias[0] = 31.3;
		temperaturaDias[1] = 32;
		temperaturaDias[2] = 33.7;
		temperaturaDias[3] = 34;
		temperaturaDias[4] = 33.1;
		
		System.out.println("A temperatura no dia 3 é: " + temperaturaDias[2]);
		
		System.out.println("O tamanho do array é: " + temperaturaDias.length);
		
		for (int i = 0; i < temperaturaDias.length; i++) {
			System.out.println("A temperatura no dia " + (i+1) + " é: " + temperaturaDias[i]);
		}
		
		//for "melhorado"
		for (double temp : temperaturaDias) {
			System.out.println(temp);
		}
	}
}