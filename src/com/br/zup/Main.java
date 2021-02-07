package com.br.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /*Os alunos devem gerar um número aleatório e comparar com uma resposta vinda do usuário.
     Caso seja o mesmo numero o usuario ganha 10 pontos, caso seja numero diferente do programa
     deve comparar para saber se o numero esta 1 acima ou 1 abaixo do numero sorteado,
     caso positivo o usuario ganha 5 pontos, caso negativo o usuario apenas perde. (Fim do jogo)
     No fim deve ser aplicado a pontuação do usuário. Tudo via console.
     */

    public static Scanner createScanner(){
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
        int pontos = 0;
        boolean continuar = true;
        int contador = 0;
        List<Integer> erros = new ArrayList<>();
        List<Integer> acertos = new ArrayList<>();

        while(continuar){
            Random numeroAleatorio = new Random();
            System.out.println("Escolha um nível de dificuldade:\n 1 para: 0 a 5\n 2 para: 0 a 10");
            int nivelEscolhido = createScanner().nextInt();
            if(nivelEscolhido == 1) {
                int numero = numeroAleatorio.nextInt(5);
                System.out.println("Tente adivinhar o número.");
                int resposta = createScanner().nextInt();

                if (resposta == numero) {
                    System.out.println("Você acertou! E ganhou 10 pontos!");
                    acertos.add(numero);
                    pontos = pontos + 10;
                    System.out.println("Seu total de pontos é: " + pontos);
                    contador++;

                } else if (resposta != numero) {
                    if (numero - resposta == 1) {
                        System.out.println("O valor digitado é " + resposta + " e o número sorteado é: " + numero
                                + " portanto você ganhou 5 pontos");
                        pontos = pontos + 5;
                        erros.add(numero);
                    } else if (numero - resposta == -1) {
                        System.out.println("Você chutou um número abaixo do valor sorteado. Você perdeu o jogo.");
                        System.out.println("Você fez um total de: " + pontos + " pontos");
                        erros.add(numero);
                    } else {
                        System.out.println("Você errou!");
                        System.out.println("Você fez um total de: " + pontos + " pontos");
                        erros.add(numero);
                    }

                }
                System.out.println("Deseja jogar novamente? Digite sim ou sair para finalizar");
                String resposta2 = createScanner().nextLine();

                if (resposta2.equalsIgnoreCase("sair")) {
                    continuar = false;
                }


            } else if(nivelEscolhido == 2) {
                int numero = numeroAleatorio.nextInt(10);
                System.out.println("Tente adivinhar o número.");
                int resposta = createScanner().nextInt();

                if(resposta == numero){
                    System.out.println("Você acertou! E ganhou 10 pontos!");
                    acertos.add(numero);
                    pontos = pontos + 10;
                    System.out.println("Seu total de pontos é: " + pontos);
                    contador++;

                } else if(resposta != numero){
                    if(numero -  resposta == 1){
                        System.out.println("O valor digitado é " + resposta + " e o número sorteado é: " +numero
                                + " portanto você ganhou 5 pontos");
                        pontos = pontos + 5;
                        erros.add(numero);
                    } else if (numero - resposta == -1){
                        System.out.println("Você chutou um número abaixo do valor sorteado. Você perdeu o jogo.");
                        System.out.println("Você fez um total de: " + pontos + " pontos");
                        erros.add(numero);
                    } else {
                        System.out.println("Você errou!");
                        System.out.println("Você fez um total de: " + pontos + " pontos");
                        erros.add(numero);
                    }

                }
                System.out.println("Deseja jogar novamente? Digite sim ou sair para finalizar");
                String resposta2 = createScanner().nextLine();

                if(resposta2.equalsIgnoreCase("sair")){
                    continuar = false;
                }
            }


            int numero = numeroAleatorio.nextInt(5);
            System.out.println("Tente adivinhar o número.");
            int resposta = createScanner().nextInt();

            if(resposta == numero){
                System.out.println("Você acertou! E ganhou 10 pontos!");
                acertos.add(numero);
                pontos = pontos + 10;
                System.out.println("Seu total de pontos é: " + pontos);
                contador++;

            } else if(resposta != numero){
                if(numero -  resposta == 1){
                    System.out.println("O valor digitado é " + resposta + " e o número sorteado é: " +numero
                            + " portanto você ganhou 5 pontos");
                    pontos = pontos + 5;
                    erros.add(numero);
                } else if (numero - resposta == -1){
                    System.out.println("Você chutou um número abaixo do valor sorteado. Você perdeu o jogo.");
                    System.out.println("Você fez um total de: " + pontos + " pontos");
                    erros.add(numero);
                } else {
                    System.out.println("Você errou!");
                    System.out.println("Você fez um total de: " + pontos + " pontos");
                    erros.add(numero);
                }

            }
            System.out.println("Deseja jogar novamente? Digite sim ou sair para finalizar");
            String resposta2 = createScanner().nextLine();

            if(resposta2.equalsIgnoreCase("sair")){
                continuar = false;
            }
        }
        System.out.println("Você fez um total de: " + pontos + " pontos. Volte Sempre!");
        System.out.println("Você acertou "+ contador + " vezes. Sendo os números: " + acertos.toString() + " e errou: " + erros.toString());


    }
}
