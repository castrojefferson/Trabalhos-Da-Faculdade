package com.exercicio3;

public class Campo {
    private int[][] campo = new int[3][3];

    public int[][] getCampo() {
        return campo;
    }

    public boolean marcarJogada(int jogador, int pos_x, int pos_y){
        if ((this.campo[pos_x][pos_y] == 1 | this.campo[pos_x][pos_y] == 2)
                         & (this.campo[pos_x][pos_y] == 1 | this.campo[pos_x][pos_y] == 2)){
            return false;
        } else {
            this.campo[pos_x][pos_y] = jogador;
            return true;
        }
    }

    public void limparCampo(){
        for (int x=0;x<=2;x++)
            for (int y=0;y<=2;y++)
                campo[x][y] = 0;
    }

    public boolean verificarVitoria(int jogador){
        if(this.campo[0][0] == jogador & this.campo[0][1] == jogador & this.campo[0][2] == jogador){
            return true;
        } else
            if(this.campo[1][0] == jogador & this.campo[1][1] == jogador & this.campo[1][2] == jogador){
                return true;
            } else
                if(this.campo[2][0] == jogador & this.campo[2][1] == jogador & this.campo[2][2] == jogador){
                    return true;
                } else
                    if(this.campo[0][0] == jogador & this.campo[1][0] == jogador & this.campo[2][0] == jogador){
                        return true;
                    } else
                        if(this.campo[0][1] == jogador & this.campo[1][1] == jogador & this.campo[2][1] == jogador){
                            return true;
                        } else
                            if(this.campo[0][2] == jogador & this.campo[1][2] == jogador & this.campo[2][2] == jogador){
                                return true;
                            } else
                                if(this.campo[0][0] == jogador & this.campo[1][1] == jogador & this.campo[2][2] == jogador){
                                    return true;
                                } else
                                    if(this.campo[0][2] == jogador & this.campo[1][1] == jogador & this.campo[2][0] == jogador){
                                        return true;
                                    }
            return false;
        }
}