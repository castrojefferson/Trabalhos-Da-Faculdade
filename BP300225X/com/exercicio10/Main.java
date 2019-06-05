package com.exercicio10;

import com.estruturadados.Mapa;

public class Main {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();

        mapa.adicionar_item("BP2434234", "Eric Cartman");
        mapa.adicionar_item("BP2444455", "Kyle Broflovsky");
        mapa.adicionar_item("BP2400444", "Stan Marshal");

        System.out.println(mapa.getObjeto("BP2434234"));
        System.out.println(mapa.getObjeto("BP2444455"));
        System.out.println(mapa.getObjeto("BP2400444"));

        System.out.println();
        mapa.removerObjeto("BP2444455");
        System.out.println();

        System.out.println(mapa.getObjeto("BP2434234"));
        System.out.println(mapa.getObjeto("BP2444455"));
        System.out.println(mapa.getObjeto("BP2400444"));
    }
}
