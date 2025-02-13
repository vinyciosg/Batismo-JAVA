package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    @Override
    public void depositar(double valor) {
        valor *= (8 % 100);
        saldo += valor;
    }
}
