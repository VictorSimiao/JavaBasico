package javaBasico.checkedExceptions;

@SuppressWarnings("serial")
public class DepositoNegativoException extends Exception {
	
	private double valor;
	
	public DepositoNegativoException(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

}
