package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class BancoController {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente(200.00,4);
        Conta conta2 = new ContaCorrente(300.00,5);
        Conta conta3 = new ContaCorrente(400.00,6);
        Conta conta4 = new ContaPoupanca(50);
    }
}
