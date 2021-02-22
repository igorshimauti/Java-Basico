package aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 2;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado % 2;
		System.out.println(resultado);
		
		resultado = resultado++;
		System.out.println(resultado);
		
		resultado = resultado--;
		System.out.println(resultado);
		
		// INCREMENTO PREFIXO E POSFIXO, DETERMINA A ORDEM DO INCREMENTO NA EXECUTAÇÃO
		System.out.println(resultado++);
		System.out.println(++resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
	}
}