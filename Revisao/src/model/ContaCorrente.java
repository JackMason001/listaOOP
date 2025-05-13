package model;

public class ContaCorrente extends Conta implements Associado{
    private int qtdeCotas;

    public ContaCorrente() {}

    public ContaCorrente(double saldo,int qtdeCotas) {
        super(saldo);
        this.qtdeCotas = qtdeCotas;
    }


    @Override
    public void atualizaSaldo(double taxa) {
    this.saldo += this.saldo * (taxa/100);
    }

    @Override
    public int qtdeCotas() {
        return 0;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "qtdeCotas=" + qtdeCotas +
                ", saldo=" + saldo +
                '}';
    }
}
