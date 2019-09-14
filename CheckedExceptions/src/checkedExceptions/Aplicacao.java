package checkedExceptions;

public class Aplicacao {

	public static void main(String[] args) {

		Banco banco = new Banco();
		try {
			banco.realizarOperacao();
		} catch (ValorNegativoException e) {
			System.out.println("Você tentou sacar um valor de : " + e.getValor());

		} catch (SaldoInsuficienteException e) {
			System.out.println("Você tentou sacar " + e.getValor() + " ,mas seu saldo atual é de:" + e.getSaldo());
		}
	}

}
