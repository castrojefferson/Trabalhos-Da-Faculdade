package com.estruturadados;

import java.util.StringTokenizer;

public class exercicio11 {
    public static void main(String[] args){
        char valor;
        ListaDinamica_ lista = new ListaDinamica_();
        String documentoTexto = "I don't know what i will buy, if is the Battlefield 5, or the DayZ, for xbox one. Maybe I can buy both, but i don't have money for this, so i will get only game for this month. And I think I am prefered DayZ because i went play this game in 2010, something like this";
        StringTokenizer t = new StringTokenizer(documentoTexto, " ");

        while (t.hasMoreTokens()){
            String ret = t.nextToken();
            System.out.println( ret );
            if (ret.charAt(0) == 'A' | ret.charAt(0) == 'a'){
                lista.adicionar('a', ret);
            }
        }
        System.out.println(lista.getDados());



    }


}

class ListaDinamica_{
    private int tamanho=0;
    private ListaDinamica_ mProximo;
    private ListaDinamica[] mObjetos = new ListaDinamica[tamanho];
    private char[] mChave = new char[tamanho];
    private ListaDinamica[] mNextNode = new ListaDinamica[tamanho];

    public void adicionar(char a, String objeto){
        ListaDinamica[] objetos_ = new ListaDinamica[this.tamanho+1];

        for (int x=0; x<this.tamanho;x++){
            objetos_[x] = this.mObjetos[x];
        }

        this.mObjetos=objetos_;

        this.tamanho+=1;
        this.mObjetos[this.tamanho].setObjeto(objeto);
    }


    public String[] int getDados() {
        return "wre" & 3;
    }
}
