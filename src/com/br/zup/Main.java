package com.br.zup;

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
        Random numeroAleatorio = new Random();
        int numero = numeroAleatorio.nextInt(5);
        int pontos = 0;

        System.out.println("Tente adivinhar o número. Sendo de 0 a 5");
        int resposta = createScanner().nextInt();

        if(resposta == numero){
            System.out.println("Você acertou! E ganhou 10 pontos!");
        } else if(resposta != numero){
            if(numero -  resposta == 1){
                System.out.println("O valor digitado é " + resposta + " e o número sorteado é: " +numero
                        + " portanto você ganhou 5 pontos");
                pontos = pontos + 5;
            } else if (numero - resposta == -1){
                System.out.println("Você chutou um número abaixo do valor sorteado. Você perdeu o jogo.");
                System.out.println("Você fez um total de: " + pontos + " pontos");
            }
        }


    }
}
