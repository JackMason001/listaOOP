package controller;

import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;

import java.util.ArrayList;
import java.util.List;

public class EmpresaController {
    public static void main(String[] args) {
        Funcionario d1 = new Desenvolvedor();
        Funcionario d2 = new Desenvolvedor("Joao",2000.00);
        Funcionario g1 = new Gerente();
        Funcionario g2 = new Gerente("Carlos",4000.00);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        d1.setNome("Marcos");
        g1.setNome("Rodrigo");
        d1.setSalario(2000.00);
        g1.setSalario(6000.00);

        System.out.println(d1.getNome());
        System.out.println(d1.getSalario());
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());

        System.out.println("\nvalor do bonus");
        System.out.println(d1.getBonus());
        System.out.println(d2.getBonus());
        System.out.println(g1.getBonus());
        System.out.println(g2.getBonus());

        List<Funcionario> funcionariosList = new ArrayList<>();
        System.out.println(funcionariosList);


    }
}
