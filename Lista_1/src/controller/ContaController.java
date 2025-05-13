package controller;

import model.Conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta(3,200.00);
        Conta conta4 = new Conta(4,50000.00);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println(conta4);

        conta1.setSaldo(2000.00);
        conta2.setSaldo(500.00);
        conta1.setId(1);
        conta2.setId(2);

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());
        System.out.println(conta4.getSaldo());

        //2
        List<Conta> contasList = new ArrayList<>();
        contasList.add(conta1);
        contasList.add(conta2);
        contasList.add(conta3);
        contasList.add(conta4);

        System.out.println("\nLista de contas:");
        System.out.println(contasList);

        contasList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("\nLista de contas por id reversa:");
        System.out.println(contasList);

        //força bruta

        System.out.println("\nPesquisa força bruta");
        for (Conta c : contasList) {
            if (2 == c.getId()) {
                System.out.println(c);
                break;
            }
        }
        contasList.sort(Comparator.comparing(Conta::getId));

        System.out.println("\n Busca binaria");
        System.out.println(contasList.get(Collections.binarySearch(
                contasList,
                new Conta(2,200.00),
                Comparator.comparing(Conta::getId)
        )));
    }
}
