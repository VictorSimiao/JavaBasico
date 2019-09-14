package checkedExceptions;

public class Banco {

	public void realizarOperacao() throws ValorNegativoException, SaldoInsuficienteException {

		ContaBancaria c1 = new ContaBancaria(1000);
		c1.sacar(1500);
		System.out.println("Saque realizado com sucesso.");
		System.out.println(c1.getSaldo());
	}

}
