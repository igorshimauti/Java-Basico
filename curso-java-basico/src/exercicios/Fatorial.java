package exercicios;

public class Fatorial {

	private int numero;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int calcularFatorial() {
		
		int resultado = 0;
		
		if(this.numero == 0) {
			resultado = 1;
		} else {
			for(int i = this.numero; i >= 1; i--) {
				resultado += this.numero * i;
			}			
		}
		
		return resultado;
	}
}