package exercicios;

import java.util.Scanner;

public class Pitagoras {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("É um triangulo retangulo? (S/N): ");
		String isRetangulo = scan.next();
		
		if (isRetangulo.equalsIgnoreCase("S")) {
			System.out.print("Digite o valor do primeiro cateto: ");
			float cateto1 = scan.nextFloat();
			
			System.out.print("Digite o valor de segundo cateto: ");
			float cateto2 = scan.nextFloat();
			
			double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
			System.out.println("Hipotenusa = " + hipotenusa);
		} else if (isRetangulo.equalsIgnoreCase("N")) {
			System.out.println("Somente é possível aplicar a fórmula em triangulos retangulos.");
		} else {
			System.out.println("Resposta inválida.");
		}
		
		scan.close();
	}
}