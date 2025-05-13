package model;

public class Conta {
    private double saldo;
    private int id;

    public Conta() {
    }

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                ", id=" + id +
                '}';
    }
}
