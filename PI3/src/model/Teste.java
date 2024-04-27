package model;


public class Teste {
    private String tipoAvaliacao;
    private double notaFinal;
    private int quantidadeDeQuestoes;
    private Modulo modulo;

    public Teste(String tipoAvaliacao, double notaFinal, int quantidadeDeQuestoes, Modulo modulo){
        this.tipoAvaliacao = tipoAvaliacao;
        this.notaFinal = notaFinal;
        this.quantidadeDeQuestoes = quantidadeDeQuestoes;
        this.modulo = modulo;
    }

    public Teste(){}

    public String getTipoAvaliacao() {
        return tipoAvaliacao;
    }
    public void setTipoAvaliacao(String tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int getQuantidadeDeQuestoes() {
        return quantidadeDeQuestoes;
    }
    public void setQuantidadeDeQuestoes(int quantidadeDeQuestoes) {
        this.quantidadeDeQuestoes = quantidadeDeQuestoes;
    }

    public Modulo getModulo() {
        return modulo;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
