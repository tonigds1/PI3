package model;


import java.util.ArrayList;

public class Modulo {
    private int idModulo;
    private String titulo;
    private String aula;
    private String atividadeModulo;
    private String conteudo;
    private Curso curso;
    private ArrayList<Aula> aulas;
    private Teste teste;

    public Modulo(int idModulo, String titulo, String aula, String atividadeModulo, String conteudo, Curso curso, ArrayList<Aula> aulas, Teste teste){
        this.idModulo = idModulo;
        this.titulo = titulo;
        this.aula = aula;
        this.atividadeModulo = atividadeModulo;
        this.conteudo = conteudo;
        this.curso = curso;
        this.aulas = aulas;
        this.teste = teste;
    }

    public Modulo(){}

    public int getIdModulo() {
        return idModulo;
    }
    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAula() {
        return aula;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getAtividadeModulo() {
        return atividadeModulo;
    }
    public void setAtividadeModulo(String atividadeModulo) {
        this.atividadeModulo = atividadeModulo;
    }

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }
    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public Teste getTeste() {
        return teste;
    }
    public void setTeste(Teste teste) {
        this.teste = teste;
    }

    public void vizualizarConteudo(){

    }

    public boolean marcarConclusaoModulo(){
        
        return marcarConclusaoModulo();
    }

    public double avaliarModulo(){
        
        return avaliarModulo();
    }
    
}
