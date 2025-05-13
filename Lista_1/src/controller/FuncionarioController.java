package controller;

import model.Funcionario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario(3,"Carlos",1500.00);
        Funcionario funcionario4 = new Funcionario(4,"Roberto",2300.00);
        Funcionario funcionario5 = new Funcionario("José");
        Funcionario funcionario6 = new Funcionario("Ian");

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
        System.out.println(funcionario5);
        System.out.println(funcionario6);

        funcionario1.setNome("Igor");
        funcionario1.setSalario(1550.00);
        funcionario2.setNome("Marcos");
        funcionario2.setSalario(4000.00);
        funcionario1.setId(1);
        funcionario2.setId(2);
        funcionario5.setId(5);
        funcionario6.setId(6);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario2.getSalario());

        //2
        List<Funcionario> funcionariosList = new ArrayList<>();
        funcionariosList.add(funcionario1);
        funcionariosList.add(funcionario2);
        funcionariosList.add(funcionario3);
        funcionariosList.add(funcionario4);
        funcionariosList.add(funcionario5);
        funcionariosList.add(funcionario6);


        System.out.println("\nLista de funcionarios:");
        System.out.println(funcionariosList);

        funcionariosList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println("\nLista de funcionarios por id reverso:");
        System.out.println(funcionariosList);

        //busca binaria

        System.out.println("\nPesquisa por funcionario id 3:");
        funcionariosList.sort(Comparator.comparing(Funcionario::getId));
        System.out.println(funcionariosList.get(Collections.binarySearch(
                funcionariosList,
                new Funcionario(3,"Carlos",1500.00),
                Comparator.comparing(Funcionario::getId)
        )));

        System.out.println("\nForca bruta");
        for (Funcionario f : funcionariosList) {
            if(3 == f.getId()) {
                System.out.println(f);
                break;
            }
        }

    }
}
