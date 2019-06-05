package com.exercicio8;

import com.estruturadados.ListaLigada;

public class Main {
    public static void main(String[] args) {
        ListaLigada[] lista_ = new ListaLigada[2];
        lista_[0] = new ListaLigada();
        lista_[1] = new ListaLigada();


        // LISTA 1
        lista_[0].setItem(10);
        lista_[1].setItem(20);
        lista_[0].setProximo(lista_[1]);
        lista_[1].setProximo(null);

        System.out.print("\nANTES\n");
        System.out.println(lista_[0].getProximo());
        System.out.println(lista_[0].getItem());
        System.out.println(lista_[1].getProximo());
        System.out.println(lista_[1].getItem());
        System.out.println();

        lista_ = lista_[0].removerNo(lista_);

        System.out.print("\nDEPOIS\n");
        System.out.println(lista_[0].getProximo());
        System.out.println(lista_[0].getItem());
        System.out.println(lista_[1].getProximo());
        System.out.println(lista_[1].getItem());
        System.out.println();
    }
}