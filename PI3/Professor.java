
import java.util.ArrayList;

public class Professor {
    private int idProfessor;
    private String nome;
    private String sobrenome;
    private String professor;
    private String areaDeConhecimento;
    private ArrayList<Aula> aulas;

    private Professor(int idProfessor, String nome, String sobrenome, String professor, String areaDeConhecimento, ArrayList<Aula> aulas){
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.professor = professor;
        this.areaDeConhecimento = areaDeConhecimento;
        this.aulas = aulas;
    }

    private Professor(){}

    public int getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
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

    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getAreaDeConhecimento() {
        return areaDeConhecimento;
    }
    public void setAreaDeConhecimento(String areaDeConhecimento) {
        this.areaDeConhecimento = areaDeConhecimento;
    }
    
    public ArrayList<Aula> getAulas() {
        return aulas;
    }
    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }
   
}