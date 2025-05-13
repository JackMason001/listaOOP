package controller;

import model.Conta;

public class ContaController {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta(200.00);
        Conta conta4 = new Conta(50000.00);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println(conta4);

        conta1.setSaldo(2000.00);
        conta2.setSaldo(500.00);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());
        System.out.println(conta4.getSaldo());

    }
}
