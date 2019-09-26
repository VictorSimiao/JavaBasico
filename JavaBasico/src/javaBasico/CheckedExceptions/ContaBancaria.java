package javaBasico.CheckedExceptions;

import javaBasico.CheckedExceptions.DepositoNegativoException;
import javaBasico.CheckedExceptions.SaldoInsuficienteException;
import javaBasico.CheckedExceptions.ValorNegativoException;

public class ContaBancaria {

	private double saldo;

	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
		if (valor <= 0) {
			throw new ValorNegativoException(valor);
		}
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException(valor, this.saldo);
		}
		this.saldo -= valor;
	}

	public void depositar(double valor) throws DepositoNegativoException {
		if (valor <= 0) {
			throw new DepositoNegativoException(valor);
		}
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}
}
