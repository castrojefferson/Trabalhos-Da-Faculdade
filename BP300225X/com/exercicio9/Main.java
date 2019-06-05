package com.exercicio9;

import com.estruturadados.ListaLigadaDupla;

public class Main {
    public static void main(String[] args) {
        ListaLigadaDupla lista1 = new ListaLigadaDupla();
        ListaLigadaDupla lista2 = new ListaLigadaDupla();
        ListaLigadaDupla lista3 = new ListaLigadaDupla();
        ListaLigadaDupla lista4 = new ListaLigadaDupla();

        lista1.setAnterior(null);
        lista1.setItem(10);
        lista1.setProximo(lista2);

        lista2.setAnterior(lista1);
        lista2.setItem(20);
        lista2.setProximo(lista3);

        lista3.setAnterior(lista2);
        lista3.setItem(30);
        lista3.setProximo(lista4);

        lista4.setAnterior(lista3);
        lista4.setItem(40);
        lista4.setProximo(null);

        System.out.println("ANTERIOR: " + lista1.getAnterior());
        System.out.println("ITEM: " + lista1.getItem());
        System.out.println("PROXIMO: " + lista1.getProximo());

        System.out.println("ANTERIOR: " + lista2.getAnterior());
        System.out.println("ITEM: " + lista2.getItem());
        System.out.println("PROXIMO: " + lista2.getProximo());

        System.out.println("ANTERIOR: " + lista3.getAnterior());
        System.out.println("ITEM: " + lista3.getItem());
        System.out.println("PROXIMO: " + lista3.getProximo());

        System.out.println("ANTERIOR: " + lista4.getAnterior());
        System.out.println("ITEM: " + lista4.getItem());
        System.out.println("PROXIMO: " + lista4.getProximo());
    }
}
