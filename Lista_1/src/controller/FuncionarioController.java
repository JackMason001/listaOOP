package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario("Carlos",1500.00);
        Funcionario funcionario4 = new Funcionario("Roberto",2300.00);
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

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario2.getSalario());
    }
}
