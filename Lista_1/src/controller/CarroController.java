package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        //1
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro(3,"Renault", "Sandero", 2011);
        Carro carro4 = new Carro(4,"peugeot", "206", 2006);
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
        carro1.setId(1);
        carro2.setId(2);
        carro5.setId(5);
        carro6.setId(6);

        System.out.println(carro1.getMarca());
        System.out.println(carro2.getMarca());

        //2
        List<Carro> carroLista = new ArrayList<>();
        carroLista.add(carro1);
        carroLista.add(carro2);
        carroLista.add(carro3);
        carroLista.add(carro4);
        carroLista.add(carro5);
        carroLista.add(carro6);


        System.out.println("\nLista de carros");
        System.out.println(carroLista);

        //Lista ordenada
        carroLista.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println("\nLista de carros por id reverso");
        System.out.println(carroLista);

        //pesquisa por força bruta:

        System.out.println("\nPesquisa por forca bruta");
        for(Carro c : carroLista) {
            if (3 == c.getId()) {
                System.out.println(c);
                break;
            }
        }

        //pesquisa binaria
        System.out.println("\nPesquisa binaria:");
        carroLista.sort(Comparator.comparing(Carro::getId));
        System.out.println(carroLista.get(Collections.binarySearch(
                carroLista,
                new Carro(6,"Porsche","Sandero",2011),
                Comparator.comparing(Carro::getId)
        )
        )
        );










        

}
}
