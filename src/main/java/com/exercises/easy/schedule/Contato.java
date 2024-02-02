package com.exercises.easy.schedule;

public class Contato {

    private String nome;
    private String email;
    private String telefone;

    public Contato(String name, String email, String telefone) {
        this.nome = name;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", nome, email, telefone);

    }

}
