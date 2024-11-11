package org.example;

public class Exercicio1 {

    public String formatarNomeCompleto(String primeiroNome, String sobrenome) {
        if (primeiroNome == null || primeiroNome.isBlank() || sobrenome == null || sobrenome.isBlank()) {
            throw new IllegalArgumentException("Nome e sobrenome não podem ser vazios.");
        }

        return primeiroNome + " " + sobrenome;
    }

    public String formatarNomeCompletoComTitulo(String titulo, String primeiroNome, String sobrenome) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título não pode ser vazio.");
        }

        return titulo + " " + formatarNomeCompleto(primeiroNome, sobrenome);
    }
}