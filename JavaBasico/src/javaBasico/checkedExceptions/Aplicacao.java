package javaBasico.checkedExceptions;

import javaBasico.checkedExceptions.Banco;
import javaBasico.checkedExceptions.DepositoNegativoException;
import javaBasico.checkedExceptions.SaldoInsuficienteException;
import javaBasico.checkedExceptions.ValorNegativoException;

public class Aplicacao {

	public static void main(String[] args) {

		Banco banco = new Banco();
		
		try {
			
			banco.realizarOperacao();
		} catch (ValorNegativoException e) {
			System.out.println("Você tentou sacar um valor de : " + e.getValor());

		} catch (SaldoInsuficienteException e) {
			System.out.println("Você tentou sacar " + e.getValor() + " ,mas seu saldo atual é de:" + e.getSaldo());
		} catch (DepositoNegativoException e) {
			System.out.println("Você tentou realizar um deposito de: " + e.getValor()
					+ " não é permitido depositos com valores negativos");
		} finally {
			System.out.println("Operação finalizada");
		}
	}

}
