package com.exercises.easy.primenumber;

import java.util.Scanner;

/**
 * Escreva um programa que receba um número inteiro e imprima na ultima linha "É primo" se o número for primo e "Não é primo" se não for primo.
 * <p>
 *   Definição: Um número é primo se ele for divisível apenas por 1 e por ele mesmo, com exceção do 1.
 * </p>
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numero = tec.nextInt();

        if (numero == 1 || numero == 0){
            System.out.println("Não é primo");
            return;
        }

        boolean isPrimo = true;

        for (int c = 2; c<numero; c++){
           if (numero % c == 0){
               isPrimo = false;
               break;
           }
        }

        if (isPrimo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

    }
}
