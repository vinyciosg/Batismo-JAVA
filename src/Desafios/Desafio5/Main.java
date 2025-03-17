package Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(100, TipoConta.CORRENTE);
        ContaPoupanca contaPoupanca = new ContaPoupanca(100, TipoConta.POUPANCA);

        contaCorrente.depositar(100);
        contaPoupanca.depositar(200);

        contaCorrente.transferencia(40, contaPoupanca);
        contaPoupanca.transferencia(60, contaCorrente);

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();

    }
}
