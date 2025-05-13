package controller;

import model.Produto;

public class ProdutoController {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto("Sintetizador",2000.00,"Sintetizador",2);
        Produto p4 = new Produto("Violao",1500.00,"Violao",2);
        Produto p5 = new Produto("Guitarra");
        Produto p6 = new Produto("Rabeca");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        p1.setNome("Ukulele");
        p2.setNome("Bateria");

        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
    }
}
