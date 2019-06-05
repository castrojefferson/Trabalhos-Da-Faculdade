package com.estruturadados;

public class Mapa {
    int tamanhoObjeto=0;
    private ListaDinamica[] objetos = new ListaDinamica[tamanhoObjeto];

    public void adicionar(String chave, String objeto){
        ListaDinamica[] objetos_ = new ListaDinamica[this.tamanhoObjeto+1];

        for (int x=0; x<this.tamanhoObjeto;x++){
            objetos_[x] = this.objetos[x];
        }

        this.objetos=objetos_;

        this.objetos[0].setChave(chave);
        this.objetos[0].setObjeto(objeto);
        this.tamanhoObjeto+=1;
    }

    public void adicionar_item(String chave, String objeto){
        ListaDinamica[] objeto_ = new ListaDinamica[this.tamanhoObjeto+1];

        for (int x=0; x<this.tamanhoObjeto;x++){
            objeto_[x] = this.objetos[x];
        }

        objeto_[this.tamanhoObjeto] = new ListaDinamica(chave, objeto);

        this.objetos = objeto_;
        this.tamanhoObjeto+=1;
    }
    public String getObjeto(String chave){
        for (int i=0; i<=this.tamanhoObjeto;i++)
            try {
                if (chave.equals(objetos[i].getChave()))
                    return objetos[i].getObjeto();
            } catch (Exception e) {}
            return "Não encontrado";
    }

    public void removerObjeto(String chave){
        ListaDinamica[] objeto_ = new ListaDinamica[this.tamanhoObjeto];
        int indice=0;

        for (int x=0; x<this.tamanhoObjeto;x++){
            if (chave.equals(this.objetos[x].getChave())) {
                indice=x;
                continue;
            }
            objeto_[x] = this.objetos[x];
        }
        this.objetos = objeto_;

        ListaDinamica[] objeto__ = new ListaDinamica[this.tamanhoObjeto-1];

        for (int x=0; x<this.tamanhoObjeto-1;x++){
            objeto__[x]=this.objetos[x];
        }
        this.tamanhoObjeto-=1;
    }
}
class ListaDinamica{
    private String chave;
    private String objeto;

    public ListaDinamica(String chave, String objeto){
        this.chave=chave;
        this.objeto=objeto;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getObjeto() {
        return objeto;
    }

    public String getChave() {
        return chave;
    }
}