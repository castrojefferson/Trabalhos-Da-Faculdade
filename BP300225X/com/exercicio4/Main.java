package com.exercicio4;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cubo cubo = new Cubo();

        int numero=0, jogadas=0;

        System.out.println("  CUBO MAGICO  ");

        while (true){
            numero=10;
            System.out.println(" ----------- ");
            System.out.println("| "+cubo.getCuboMagico()[0][0]+" | "+cubo.getCuboMagico()[0][1]+" | "+cubo.getCuboMagico()[0][2]+" |");
            System.out.println("| "+cubo.getCuboMagico()[1][0]+" | "+cubo.getCuboMagico()[1][1]+" | "+cubo.getCuboMagico()[1][2]+" |");
            System.out.println("| "+cubo.getCuboMagico()[2][0]+" | "+cubo.getCuboMagico()[2][1]+" | "+cubo.getCuboMagico()[2][2]+" |");
            System.out.println(" ----------- ");
            try {
                System.out.print("Numero >>> ");
                numero = input.nextInt(); input.nextLine();
            } catch (Exception e){
                System.out.println("Numero Invalido");
                break;
            }
            if (numero == 0)
                break;

            if (cubo.existeNumero(numero) | (numero < 0 | numero > 9)){
                System.out.println("Digite um numero entre 1 á 9 que nao tenha sido digitado");
                continue;
            } else
                jogadas++;

            cubo.inserirNumer(numero);
            if(jogadas==9)
                if(cubo.verificarNUMERO_PLANETARIO()){

                    System.out.println(" ----------- ");
                    System.out.println("| "+cubo.getCuboMagico()[0][0]+" | "+cubo.getCuboMagico()[0][1]+" | "+cubo.getCuboMagico()[0][2]+" |");
                    System.out.println("| "+cubo.getCuboMagico()[1][0]+" | "+cubo.getCuboMagico()[1][1]+" | "+cubo.getCuboMagico()[1][2]+" |");
                    System.out.println("| "+cubo.getCuboMagico()[2][0]+" | "+cubo.getCuboMagico()[2][1]+" | "+cubo.getCuboMagico()[2][2]+" |");
                    System.out.println(" ----------- ");

                    System.out.println("Parabens voce acertou");
                    cubo.limparCampo();
                } else {
                    System.out.println("Você perdeu");
                    cubo.limparCampo();
                }
        }

    }
}