package com.estruturadados;

import java.util.concurrent.ExecutionException;

public class ListaLigada {
    private int item;

    private ListaLigada proximo;

    public void setItem(int item) {
        this.item = item;
    }

    public void setProximo(ListaLigada proximo) {
        this.proximo = proximo;
    }

    public int getItem() {
        return item;
    }

    public ListaLigada getProximo() {
        return proximo;
    }
    public boolean ordemCrescente(ListaLigada primeiroObjeto){
        int primeiroValor = primeiroObjeto.getItem();
        ListaLigada objeto = new ListaLigada();
        objeto = primeiroObjeto;

        try {
            while (true) {
                if (objeto.getProximo() == null)
                    break;
                objeto = objeto.getProximo();

                if (primeiroValor <= objeto.getItem()) {
                    primeiroValor=objeto.getItem();
                    continue;
                } else {
                    return false;
                }
            }
        } catch (Exception e){}
        return true;
    }

    public int busca_iterativa(ListaLigada primeiroObjeto, int numero) {
        ListaLigada objeto = new ListaLigada();
        objeto = primeiroObjeto;
        int achou=0;

        try {
            while (true) {
                if (objeto.getProximo() == null)
                    break;
                objeto = objeto.getProximo();

                if (numero == objeto.getItem()) {
                    achou+=1;
                } else {
                    continue;
                }
            }
        } catch (Exception e){}

        return achou;
    }
    public int busca_recursiva(ListaLigada primeiroObjeto, int numero) {
        ListaLigada objeto = new ListaLigada();
        objeto = primeiroObjeto;
        int achou=0;

        if (objeto.getProximo() == null) {
            if (objeto.getItem() == numero){
                achou+=1;
            }
            return achou;
        }
        if (numero == objeto.getItem()) {
            achou+=1;
        } else {
        }

        return achou + busca_recursiva(objeto.getProximo(), numero);
    }
    public void concatenarListaIterativo(ListaLigada lista1, ListaLigada lista2){

        while (true){
            lista1=lista1.getProximo();
            if (lista1.getProximo() == null){
                lista1.setProximo(lista2);
                break;
            }
        }
    }
    public boolean concatenarListaRecursivo(ListaLigada lista1, ListaLigada lista2){

        if (lista1.getProximo() == null){
            lista1.setProximo(lista2);
            return true;
        } else {
            lista1=lista1.getProximo();
            return concatenarListaRecursivo(lista1, lista2);
        }
    }
    public ListaLigada[] trocarNo(ListaLigada lista1, ListaLigada lista2){
        ListaLigada[] lista_ = new ListaLigada[2];

        lista_[0] = lista2;
        lista_[1] = lista1;

        return lista_;
    }
    public ListaLigada[] removerNo (ListaLigada[] lista_){
        int i=0;
        while (true){
            try {
                    lista_[i].setProximo(null);
                    lista_[i].setItem(0);
                    i += 1;
                } catch (Exception e){
                    break;
                }
        }

        return lista_;
    }
}
