package javaBasico.checkedExceptions;

import javaBasico.checkedExceptions.ContaBancaria;
import javaBasico.checkedExceptions.DepositoNegativoException;
import javaBasico.checkedExceptions.SaldoInsuficienteException;
import javaBasico.checkedExceptions.ValorNegativoException;

public class Banco {

	public void realizarOperacao() throws ValorNegativoException, SaldoInsuficienteException,DepositoNegativoException {

		ContaBancaria c1 = new ContaBancaria(1000);
		c1.sacar(100);
		System.out.println("Saque realizado com sucesso.");
		c1.depositar(1500);
		System.out.println("Deposito realizado com sucesso");
		System.out.println(c1.getSaldo());
	}

}
