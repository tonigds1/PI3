import java.util.ArrayList;

public class Trilha {
    private int idTrilha;
    private String nomeTrilha;
    private String desricao;
    private ArrayList<Curso> cursosDisponiveis;
    private ArrayList<Usuario> usuarios;

    public Trilha (int idTrilha, String nomeTrilha, String descricao, ArrayList<Curso> cursosDisponiveis, ArrayList<Usuario> usuarios ){
        this.idTrilha = idTrilha;
        this.nomeTrilha = nomeTrilha;
        this.desricao = descricao;
        this.cursosDisponiveis = cursosDisponiveis;
        this.usuarios = usuarios;
    }

    public Trilha(){}

    public int getIdTrilha() {
        return idTrilha;
    }public void setIdTrilha(int idTrilha) {
        this.idTrilha = idTrilha;
    }
    
    public String getNomeTrilha() {
        return nomeTrilha;
    }
    public void setNomeTrilha(String nomeTrilha) {
        this.nomeTrilha = nomeTrilha;
    }

    public String getDesricao() {
        return desricao;
    }
    public void setDesricao(String desricao) {
        this.desricao = desricao;
    }
    
public ArrayList<Curso> getCursosDisponiveis() {
    return cursosDisponiveis;
}
public void setCursosDisponiveis(ArrayList<Curso> cursosDisponiveis) {
    this.cursosDisponiveis = cursosDisponiveis;
}

public ArrayList<Usuario> getUsuarios() {
    return usuarios;
}
public void setUsuarios(ArrayList<Usuario> usuarios) {
    this.usuarios = usuarios;
}

public int calcularProgresso(){

    return calcularProgresso();
}
    
}
