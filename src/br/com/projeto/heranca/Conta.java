
package br.com.projeto.heranca;


public class Conta {
  private String titular;
  private Integer numero;
  protected Double saldo;

    public Conta(String titular, Integer numero, Double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
  
  

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "titular=" + titular + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
          
}
