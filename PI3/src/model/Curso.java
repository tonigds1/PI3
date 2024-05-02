package model;


import java.util.ArrayList;

public class Curso {
    private int idCurso;
    private String nomeDoCurso;
    private String descricao;
    private ArrayList<Modulo> modulos;
    private Trilha trilha;
    private double avaliacaoCurso;
    private double porcentagemDeConclusao;

    public Curso(int idCurso,String nomeDoCurso, String descricao, ArrayList<Modulo> modulos,Trilha trilha, double avaliacaoCurso){
        this.idCurso = idCurso;
        this.nomeDoCurso = nomeDoCurso;
        this.descricao = descricao;
        this.modulos = modulos;
        this.trilha = trilha;
        this.avaliacaoCurso = avaliacaoCurso;
        this.porcentagemDeConclusao = 0;
    }

    public Curso(){}

    public int getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }
    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }
    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public Trilha getTrilha() {
        return trilha;
    }
    public void setTrilha(Trilha trilha) {
        this.trilha = trilha;
    }

    public double getAvaliacaoCurso() {
        return avaliacaoCurso;
    }
    public void setAvaliacaoCurso(double avaliacaoCurso) {
        this.avaliacaoCurso = avaliacaoCurso;
    }
    
    public double getPorcentagemDeConclusao() {
        return porcentagemDeConclusao;
    }
    public void setPorcentagemDeConclusao(double porcentagemDeConclusao) {
        this.porcentagemDeConclusao = porcentagemDeConclusao;
    }
}
