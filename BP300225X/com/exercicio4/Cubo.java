package com.exercicio4;

public class Cubo {
    int[][] cuboMagico = new int[3][3];
    int NUMERO_PLANETARIO = 15;
    int coluna=0;
    int linha=0;

    public boolean verificarNUMERO_PLANETARIO() {
        if (
            (this.cuboMagico[0][0] + this.cuboMagico[0][1] + this.cuboMagico[0][2] == NUMERO_PLANETARIO) &
            (this.cuboMagico[1][0] + this.cuboMagico[1][1] + this.cuboMagico[1][2] == NUMERO_PLANETARIO) &
            (this.cuboMagico[2][0] + this.cuboMagico[2][1] + this.cuboMagico[2][2] == NUMERO_PLANETARIO) &

            (this.cuboMagico[0][0] + this.cuboMagico[1][0] + this.cuboMagico[2][0] == NUMERO_PLANETARIO) &
            (this.cuboMagico[0][1] + this.cuboMagico[1][1] + this.cuboMagico[2][1] == NUMERO_PLANETARIO) &
            (this.cuboMagico[0][2] + this.cuboMagico[1][2] + this.cuboMagico[2][2] == NUMERO_PLANETARIO) &

            (this.cuboMagico[2][0] + this.cuboMagico[1][1] + this.cuboMagico[0][2] == NUMERO_PLANETARIO) &
            (this.cuboMagico[0][0] + this.cuboMagico[1][1] + this.cuboMagico[2][2] == NUMERO_PLANETARIO)
        ) {
            return true;
        }
        System.out.println(this.cuboMagico[0][0] + this.cuboMagico[0][1] + this.cuboMagico[0][2]);
        System.out.println(this.cuboMagico[1][0] + this.cuboMagico[1][1] + this.cuboMagico[1][2]);
        System.out.println(this.cuboMagico[2][0] + this.cuboMagico[2][1] + this.cuboMagico[2][2]);
        System.out.println(this.cuboMagico[0][0] + this.cuboMagico[1][0] + this.cuboMagico[2][0]);
        System.out.println(this.cuboMagico[0][1] + this.cuboMagico[1][1] + this.cuboMagico[2][1]);
        System.out.println(this.cuboMagico[0][2] + this.cuboMagico[1][2] + this.cuboMagico[2][2]);
        System.out.println(this.cuboMagico[0][0] + this.cuboMagico[1][1] + this.cuboMagico[2][2]);
        System.out.println(this.cuboMagico[0][0] + this.cuboMagico[1][1] + this.cuboMagico[2][2]);

        System.out.println(this.cuboMagico[0][0] + this.cuboMagico[0][1] + this.cuboMagico[0][2] == NUMERO_PLANETARIO);
        System.out.println(this.cuboMagico[1][0] + this.cuboMagico[1][1] + this.cuboMagico[1][2] == NUMERO_PLANETARIO);
        System.out.println(this.cuboMagico[2][0] + this.cuboMagico[2][1] + this.cuboMagico[2][2] == NUMERO_PLANETARIO);
        System.out.println(this.cuboMagico[0][0] + this.cuboMagico[1][0] + this.cuboMagico[2][0] == NUMERO_PLANETARIO);
        System.out.println(this.cuboMagico[0][1] + this.cuboMagico[1][1] + this.cuboMagico[2][1] == NUMERO_PLANETARIO);
        System.out.println(this.cuboMagico[0][2] + this.cuboMagico[1][2] + this.cuboMagico[2][2] == NUMERO_PLANETARIO);
        System.out.println(this.cuboMagico[2][0] + this.cuboMagico[1][1] + this.cuboMagico[0][2] == NUMERO_PLANETARIO);
        System.out.println(this.cuboMagico[0][0] + this.cuboMagico[1][1] + this.cuboMagico[2][2] == NUMERO_PLANETARIO);

        return false;
    }

    public int[][] getCuboMagico() {
        return this.cuboMagico;
    }

    public boolean existeNumero(int numero){
        for(int x=0; x<=2; x++)
            for (int y=0; y<=2; y++)
                if (this.cuboMagico[x][y] == numero)
                   return true;

        return false;
    }

    public void inserirNumer(int numero){
        this.cuboMagico[this.coluna][this.linha] = numero;

        if (this.coluna < 2)
            this.coluna++;
        else {
            this.coluna=0;
            if (this.linha < 2)
                this.linha++;
            else
                this.linha=0;
            }
    }

    public void limparCampo(){
        for(int x=0; x<=2; x++)
            for (int y=0; y<=2; y++)
                this.cuboMagico[x][y] = 0;
        this.coluna=0;
        this.linha=0;
    }
}
