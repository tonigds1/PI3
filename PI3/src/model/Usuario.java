package model;


import java.util.ArrayList;

public class Usuario {
    //Atributos
    private int id;
    private String nome;
    private String sobrenome;
    private ArrayList<Trilha> trilhas;

    //Construtor completo, e vazio
    public Usuario(int id, String nome, String sobrenome){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.trilhas = null;
    }
    public Usuario(){}

    //Getters & Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public ArrayList<Trilha> getTrilhas() {
        return trilhas;
    }
    public void setTrilhas(ArrayList<Trilha> trilhas) {
        this.trilhas = trilhas;
    }
}