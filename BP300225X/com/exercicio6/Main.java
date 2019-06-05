package com.exercicio6;

import com.estruturadados.ListaLigada;

public class Main {
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();
        ListaLigada lista2 = new ListaLigada();
        ListaLigada lista3 = new ListaLigada();
        ListaLigada lista4 = new ListaLigada();

        // LISTA 1
        lista1.setItem(10);
        lista1.setProximo(lista2);
        lista2.setItem(20);
        lista2.setProximo(null);

        // LISTA 2
        lista3.setItem(30);
        lista3.setProximo(lista4);
        lista4.setItem(40);
        lista4.setProximo(null);

        System.out.print("\nITERATIVA\n");
        System.out.println(lista1.getProximo());
        System.out.println(lista2.getProximo());
        System.out.println(lista3.getProximo());
        System.out.println(lista4.getProximo());
        System.out.println();

        lista1.concatenarListaIterativo(lista1, lista3);

        System.out.println(lista1.getProximo());
        System.out.println(lista2.getProximo());
        System.out.println(lista3.getProximo());
        System.out.println(lista4.getProximo());


        System.out.println();System.out.println();


        // LISTA 1
        lista1.setItem(10);
        lista1.setProximo(lista2);
        lista2.setItem(20);
        lista2.setProximo(null);

        // LISTA 2
        lista3.setItem(30);
        lista3.setProximo(lista4);
        lista4.setItem(40);
        lista4.setProximo(null);

        System.out.print("\nRECURSIVA\n");
        System.out.println(lista1.getProximo());
        System.out.println(lista2.getProximo());
        System.out.println(lista3.getProximo());
        System.out.println(lista4.getProximo());
        System.out.println();

        lista1.concatenarListaRecursivo(lista1, lista3);

        System.out.println(lista1.getProximo());
        System.out.println(lista2.getProximo());
        System.out.println(lista3.getProximo());
        System.out.println(lista4.getProximo());
    }
}
