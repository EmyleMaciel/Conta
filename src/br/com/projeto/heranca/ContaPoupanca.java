
package br.com.projeto.heranca;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, Integer numero, Double saldo) {
        super(titular, numero, saldo);
    }
    public void depositar(Double valor, Double taxaDeJuros) {
		
		saldo += valor + (valor * taxaDeJuros);
	}
	
}

