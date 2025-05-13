package controller;

import model.Carro;

public class CarroController {
    public static void main(String[] args) {
        //1
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro("Renault", "Sandero", 2011);
        Carro carro4 = new Carro("peugeot", "206", 2006);
        Carro carro5 = new Carro("Fiat");
        Carro carro6 = new Carro("Honda");

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
        System.out.println(carro5);
        System.out.println(carro6);

        carro1.setMarca("Jeep");
        carro2.setMarca("BMW");

        System.out.println(carro1.getMarca());
        System.out.println(carro2.getMarca());

        //2
        
    }
}
