
package br.com.projeto.heranca;

public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, Integer numero, Double saldo) {
        
        super(titular, numero, saldo);
        
    }
	
	public void sacar(Double valor, Double taxaDeJuros) {
		
		Double valorSacado;
		saldo -= valor;
		valorSacado = valor -  (valor * taxaDeJuros);
		System.out.println("Valor sacado: " + valorSacado);
		
        }
}
