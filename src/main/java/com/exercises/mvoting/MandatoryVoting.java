package com.exercises.mvoting;

import java.util.Scanner;

/**
 * Escreva um programa que avalie a obrigatoriedade do voto com base na idade de acordo com os seguintes critérios:
 * <p>
 * 1. Menores de 16 anos não têm direito ao voto.
 * <p>
 * 2. Dos 16 até 18 anos incompletos, o voto é opcional.
 * <p>
 * 3. Dos 18 até 70 anos incompletos, o voto é obrigatório.
 * <p>
 * 4. Para pessoas com 70 anos ou mais. o voto é opcional.
 * <p>
 * <a href="https://www.tre-sc.jus.br/eleicoes/tire-suas-duvidas/voto-obrigatoriedade">Voto – obrigatoriedade</a>
 * <p>
 * O programa deve receber a idade como valor de entrada (um número inteiro) e imprimir "Opcional", "Não vota" ou "Obrigatório", dependendo da idade.
 * <p>
 * Run test: gradlew :test --tests "com.exercises.mvoting.MandatoryVotingTest"
 */
public class MandatoryVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não vota");
        } else {
            if (idade < 18 || idade >= 70) {
                System.out.println("Opcional");
            } else {
                System.out.println("Obrigatório");
            }
        }
    }
}
