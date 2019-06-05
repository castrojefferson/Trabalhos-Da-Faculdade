package com.exercicio5;
import com.estruturadados.ListaLigada;

public class Main {
    public static void main(String[] args) {
        Main self = new Main();

        ListaLigada lista1 = new ListaLigada();
        ListaLigada lista2 = new ListaLigada();
        ListaLigada lista3 = new ListaLigada();
        ListaLigada lista4 = new ListaLigada();
        ListaLigada lista5 = new ListaLigada();
        ListaLigada lista6 = new ListaLigada();
        ListaLigada lista7 = new ListaLigada();
        ListaLigada lista8 = new ListaLigada();
        ListaLigada lista9 = new ListaLigada();
        ListaLigada lista10 = new ListaLigada();

        lista1.setItem(10);
        lista1.setProximo(lista2);

        lista2.setItem(20);
        lista2.setProximo(lista3);

        lista3.setItem(30);
        lista3.setProximo(lista4);

        lista4.setItem(40);
        lista4.setProximo(lista5);

        lista5.setItem(50);
        lista5.setProximo(lista6);

        lista6.setItem(60);
        lista6.setProximo(lista7);

        lista7.setItem(70);
        lista7.setProximo(lista8);

        lista8.setItem(80);
        lista8.setProximo(lista9);

        lista9.setItem(90);
        lista9.setProximo(lista10);

        lista10.setItem(100);
        lista10.setProximo(null);

        System.out.println(lista1.ordemCrescente(lista1));
        System.out.println(lista1.busca_iterativa(lista1, 20));
        System.out.println(lista1.busca_recursiva(lista1, 20));


    }

}