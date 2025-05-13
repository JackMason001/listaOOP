package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void atualizaSaldo(double taxa) {
        this.saldo += this.saldo * (taxa/100);

    }
}
