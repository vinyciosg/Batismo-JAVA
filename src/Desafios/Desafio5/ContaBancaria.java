package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta {

    double saldo ;
    TipoConta tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferencia(double valor, ContaCorrente contaAlvo){
        if (valor <= saldo) {
            saldo-= valor;
            contaAlvo.saldo += valor;
            System.out.println("Transferencia realizada com sucesso! Saldo atual: " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferencia(double valor, ContaPoupanca contaAlvo){
        if (valor <= saldo) {
            saldo-= valor;
            contaAlvo.saldo += valor;
            System.out.println("Transferencia realizada com sucesso! Saldo atual: " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }


}
