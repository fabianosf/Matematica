package pacote;

public class Matematica {

	private int numero1 = 0;
	private int numero2 = 0;
	
	
	public Matematica() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int somarNumero(int numero1, int numero2) {		
		return numero1 + numero2;
		
	}

}
