package controller;

import model.Automovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AutomovelController {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel();
        Automovel auto2 = new Automovel();
        Automovel auto3 = new Automovel(3,"2122","INI8282","verde",4,"gasolina",13222,"666",222.00);
        Automovel auto4 = new Automovel(4,"838372","OSA7261","vermelho",4,"gasolina",747838,"74385",200.00);
        Automovel auto5 = new Automovel("UNS8762");
        Automovel auto6 = new Automovel("PNS5342");

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);
        System.out.println(auto6);

        auto1.setPlaca("YNI9823");
        auto2.setPlaca("SLA9847");
        auto1.setId(1);
        auto2.setId(2);
        auto5.setId(5);
        auto6.setId(6);
        auto1.setRenavam("848489");
        auto2.setRenavam("804932");
        auto5.setRenavam("029934");
        auto6.setRenavam("123445");


        System.out.println(auto1.getPlaca());
        System.out.println(auto2.getPlaca());

        List<Automovel> automovelList = new ArrayList<>();
        automovelList.add(auto1);
        automovelList.add(auto2);
        automovelList.add(auto3);
        automovelList.add(auto4);
        automovelList.add(auto5);
        automovelList.add(auto6);


        System.out.println("\nLista de automoveis:");
        System.out.println(automovelList);

    //ordenação
        System.out.println("\nLista de automoveis por renavam inversa");
        automovelList.sort(Comparator.comparing(Automovel::getRenavam).reversed());
        System.out.println(automovelList);

        System.out.println("\nLista de automoveis por id reverso");
        automovelList.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println(automovelList);

        //pesquisa força bruta
        System.out.println("\nProcura bruta pelo renavam 848489");
        for (Automovel a : automovelList) {
            if("848489".equals(a.getRenavam())){
                System.out.println(a);
                break;
            }
        }

        //pesquisa binaria pelo renavam
        System.out.println("\nProcura binaria pelo renavam");
        automovelList.sort(Comparator.comparing(Automovel::getRenavam));
        System.out.println(automovelList.get(Collections.binarySearch(
                automovelList,
                new Automovel(2,"848489","sdsada","rosa",4,"dsakdmsak",84746,"kjdndajknc",200.00),
                Comparator.comparing(Automovel::getRenavam)
                        )
                )
        );




    }
}
