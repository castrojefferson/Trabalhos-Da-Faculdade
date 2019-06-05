package com.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Campo campo = new Campo();
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        int escolha=0, pos_x=0, pos_y=0, jogador=1, jogadas=0;

        System.out.print("JOGADOR 1\nNome: ");
        jogador1.setNome(input.nextLine());

        System.out.print("JOGADOR 2\nNome: ");
        jogador2.setNome(input.nextLine());

        while (true) {
            desenharMapa(campo);
            if (jogador==1) {
                System.out.println(jogador1.getNome());
                try {
                    System.out.print("\nPosicao x > ");
                    pos_x = input.nextInt(); input.nextLine();
                    if (pos_x < 0 | pos_x > 2) {
                        System.out.println("Numero Invalido\n Numeros aceitos de 0 á 2");
                        continue;
                    }
                    jogadas+=1;
                } catch (Exception e) {
                    System.out.println("Numero Invalido");
                    pos_x=0;pos_y=0;
                    break;
                }

                try {
                    System.out.print("\nPosicao y > ");
                    pos_y = input.nextInt(); input.nextLine();
                    if (pos_y < 0 | pos_y > 2) {
                        System.out.println("Numero Invalido\n Numeros aceitos de 0 á 2");
                        continue;
                    }
                    jogadas+=1;
                } catch (Exception e) {
                    System.out.println("Numero Invalido");
                    pos_x=0;pos_y=0;
                    break;
                }

                if (!(campo.marcarJogada(jogador, pos_y, pos_x))){
                    jogador=1;
                } else {
                    if (!(campo.verificarVitoria(jogador)))
                        jogador = 2;
                    else {
                        desenharMapa(campo);
                        System.out.println(jogador1.getNome() + " Venceu, parabens");
                        jogador1.setVitorias(jogador1.getVitorias()+1);
                        jogador=3;
                        System.out.println("Numero de jogadas: " + jogadas);
                    }
                }
            } else
                if (jogador==2){
                    System.out.println(jogador2.getNome());
                    try {
                        System.out.print("\nPosicao x > ");
                        pos_x = input.nextInt(); input.nextLine();
                        if (pos_x < 0 | pos_x > 2){
                            System.out.println("Numero Invalido\n Numeros aceitos de 0 á 2");
                            pos_x=0;pos_y=0;
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("Numero Invalido");
                        break;
                    }
                    try {
                        System.out.print("\nPosicao y > ");
                        pos_y = input.nextInt(); input.nextLine();
                        if (pos_y < 0 | pos_y > 2)
                        {
                            System.out.println("Numero Invalido\n Numeros aceitos de 0 á 2");
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("Numero Invalido");
                        pos_x=0;pos_y=0;
                        break;
                    }


                    if (!(campo.marcarJogada(jogador, pos_y, pos_x))) {
                        jogador = 2;
                    } else {
                        if (!(campo.verificarVitoria(jogador)))
                            jogador = 1;
                        else {
                            desenharMapa(campo);
                            System.out.println(jogador2.getNome() + " Venceu, parabens");
                            jogador2.setVitorias(jogador2.getVitorias()+1);
                            jogador=3;
                            System.out.println("Numero de jogadas: " + jogadas);
                        }
                    }
                }
            if (jogador==3) {
                while (true) {
                    System.out.print("1) Jogar denovo\n2) Sair\n> ");
                    try {
                        escolha = input.nextInt(); input.nextLine();
                        if (escolha < 1 | escolha > 2){
                            System.out.println("Numero Invalido, apenas 1 ou 2");
                            escolha=0;
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("Numero Invalido");
                    }
                    break;
                }
                if (escolha == 2) {
                    System.out.print(jogador1.getNome()+": ");
                    System.out.println(jogador1.getVitorias());
                    System.out.print(jogador2.getNome()+": ");
                    System.out.println(jogador2.getVitorias());

                    break;
                }
                else {
                    campo.limparCampo();
                    jogador=1;
                    continue;
                }
            }
        }
    }
    public static void desenharMapa(Campo campo){
        for (int[] campo_ : campo.getCampo()
        ) {
            for (int campo__ : campo_
            ) {
                System.out.print(campo__ + "\t");
            } System.out.println("\n");
        }
    }
}
