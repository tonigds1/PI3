package model;


import java.util.ArrayList;

public class Aula {
    private int idAula;
    private String tituloAula;
    private String descricao;
    private String professor;
    private String duracao;
    private Modulo modulo;
    private ArrayList<Professor> professores;
    private ArrayList<AvaliacaoAula> avaliacoesAula;

    public Aula(int idAula, String tituloAula, String descricao, String professor, String duracao, Modulo modulo, ArrayList<Professor> professores, ArrayList<AvaliacaoAula> avaliacoesAula){
        this.idAula = idAula;
        this.tituloAula = tituloAula;
        this.descricao = descricao;
        this.professor = professor;
        this.duracao = duracao;
        this.modulo = modulo;
        this.professores = professores;
        this.avaliacoesAula = avaliacoesAula;
    }

    public Aula() {
        this.professores = new ArrayList<>();
        this.avaliacoesAula = new ArrayList<>();
    }

    public int getIdAula() {
        return idAula;
    }
    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public String getTituloAula() {
        return tituloAula;
    }
    public void setTituloAula(String tituloAula) {
        this.tituloAula = tituloAula;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Modulo getModulo() {
        return modulo;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    
    public ArrayList<AvaliacaoAula> getAvaliacoesAula() {
        return avaliacoesAula;
    }
    public void setAvaliacoesAula(ArrayList<AvaliacaoAula> avaliacoesAula) {
        this.avaliacoesAula = avaliacoesAula;
    }

    
}
