package com.exercises.calculator;

import java.util.Scanner;

/**
 * Crie um programa que seja capaz de realizar as seguintes operações matemáticas:
 * adição (a), subtração (s), multiplicação (m), divisão (d), potenciação (p) e raiz quadrada (r).
 * <p>
 * O programa deve aguardar como entrada a letra correspondente à operação desejada, os valores necessários
 * para a operação e, em seguida, printar o resultado por ultimo no formato "Resultado: %.2f".
 * <p>
 * Rodar test: gradlew :test --tests "com.exercises.calculator.CalculatorTest"
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("a. adição");
        System.out.println("s. subtração");
        System.out.println("m. multiplicação");
        System.out.println("d. divisão");
        System.out.println("p. potenciação");
        System.out.println("r. raiz quadradda");

        String op = scanner.next();

        if (op.equals("a")) {
            System.out.print("a: ");
            double a = scanner.nextDouble();

            System.out.print("b: ");
            double b = scanner.nextDouble();

            System.out.println();

            System.out.printf("Resultado: %.2f", a + b);
        }

        if (op.equals("s")) {
            System.out.print("a: ");
            double a = scanner.nextDouble();

            System.out.print("b: ");
            double b = scanner.nextDouble();

            System.out.println();

            System.out.printf("Resultado: %.2f", a - b);
        }

        if (op.equals("m")) {
            System.out.print("a: ");
            double a = scanner.nextDouble();

            System.out.print("b: ");
            double b = scanner.nextDouble();

            System.out.println();

            System.out.printf("Resultado: %.2f", a * b);
        }
    }
}
