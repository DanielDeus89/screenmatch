package br.com.deus.exercicios;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private int numAvaliacoes;


    private double avaliacao;
    private double peso;
    private double somaAvaliacao;


    public void setSomaAvaliacao(double avaliacao) {
        this.somaAvaliacao += avaliacao;
        numAvaliacoes++;
    }

    public double getMediaAvaliacao() {
        return (somaAvaliacao / numAvaliacoes);
    }

}
