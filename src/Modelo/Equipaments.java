package Modelo;

import javafx.scene.control.TextField;

public class Equipaments {
    private String nome;
    private int numero;
    private int emprestar;
    private int receber;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEmprestar() {
        return emprestar;
    }

    public void setEmprestar(int emprestar) {
        this.emprestar = emprestar;
    }

    public int getReceber() {
        return receber;
    }

    public void setReceber(int receber) {
        this.receber = receber;
    }

}
