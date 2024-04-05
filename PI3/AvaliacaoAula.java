public class AvaliacaoAula {
    private String comentario;
    private double procentagemAvaliacao;
    private Aula aula;

    public AvaliacaoAula(String comentario, double procentagemAvaliacao, Aula aula){
        this.comentario = comentario;
        this.procentagemAvaliacao = procentagemAvaliacao;
        this.aula = aula;
    }

    public AvaliacaoAula(){}

    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getProcentagemAvaliacao() {
        return procentagemAvaliacao;
    }
    public void setProcentagemAvaliacao(double procentagemAvaliacao) {
        this.procentagemAvaliacao = procentagemAvaliacao;
    }

    public Aula getAula() {
        return aula;
    }
    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public void publicarAvalaiacao(){
     
    }
    
}
