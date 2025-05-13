package model;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void deposita(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    public void atualiza(double taxa){
        this.saldo *= taxa;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
