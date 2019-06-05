package com.estruturadados;

public class ListaLigadaDupla {
    private int item;

    private ListaLigadaDupla proximo;
    private ListaLigadaDupla anterior;

    public void setItem(int item) {
        this.item = item;
    }

    public void setProximo(ListaLigadaDupla proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(ListaLigadaDupla anterior) {
        this.anterior = anterior;
    }

    public int getItem() {
        return item;
    }

    public ListaLigadaDupla getProximo() {
        return proximo;
    }

    public ListaLigadaDupla getAnterior() {
        return anterior;
    }
}
