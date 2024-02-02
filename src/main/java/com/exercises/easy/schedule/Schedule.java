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

    private Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {


        Schedule schedule = new Schedule();

        schedule.run();

    }

    private void run() {

        int opcao;

        do {

            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Listar contatos");
            System.out.println("0 - Sair");

            opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    listar();
                    break;
            }
        } while (opcao != 0);

    }

    private void removeContact() {
        System.out.println("Qual a posição?");

        int index = Integer.parseInt(teclado.nextLine());
        contatos.remove(index);
    }

    private void addContact() {

        System.out.println("Nome: ");
        String name = teclado.nextLine();

        System.out.println("Email: ");
        String email = teclado.nextLine();

        System.out.println("Telefone: ");
        String telefone = teclado.nextLine();

        System.out.println("");

        contatos.add(new Contato(name, email, telefone));
    }

    private void listar() {
        for (int i = 0; i < contatos.size(); i++) {

            Contato contato = contatos.get(i);

            System.out.printf("[%d] %s%n", i, contato);
        }
    }

}

