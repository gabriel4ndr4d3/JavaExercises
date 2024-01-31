package com.exercises.easy.schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Crie um programa que simule uma agenda de contatos. <br>
 * O programa deve ter as seguintes entradas;
 * <ul>
 *     <li>1 - Adicionar contato</li>
 *     O programa deve registrar e guardar o nome, email e telefone do contato. Nessa ordem.
 *     <li>2 - Remove contato:</li>
 *     O programa  deve remover um contato pelo seu índice.
 *     <li>3 - Listar contatos:</li>
 *     O programa deve listar todos os contatos registrados, no seguinte formato: [indice] {nome} - [email] - {telefone}.
 *     <li>0 - Sair</li>
 *     O programa deve encerrar a execução.
 * </ul>
 * 1. Apenas os resultados dos comandos 3 serão considerados. <br>
 * 2. Veja a lista de erros a serem emitidos na classe Error desse pacote. <br>
 */
public class Schedule {

   private List<Contato> contatos = new ArrayList<>();

    public static void main(String[] args) {

       Schedule schedule =  new Schedule();

       schedule.run();

    }

    private void run() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Remover contato");
        System.out.println("3 - Listar contatos");
        System.out.println("0 - Sair");

        int opcao;

        do {
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    addContact();
                    break;
            }

        } while (opcao != 0);
    }

    private void addContact() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = teclado.nextLine();

        System.out.print("Email: ");
        String email = teclado.nextLine();

        System.out.print("Telefone: ");
        String telefone = teclado.nextLine();

        System.out.println("");

        contatos.add(new Contato(name,email,telefone));
    }
}

