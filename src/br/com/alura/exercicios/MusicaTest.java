package br.com.alura.exercicios;

public class MusicaTest {
    public static void main(String[] args) {
        Musica m = new Musica();

        m.setSomaAvaliacao(5);
        m.setSomaAvaliacao(5);
        m.setSomaAvaliacao(5);
        m.setSomaAvaliacao(6);


        System.out.printf("Media das Avaliaçõs: %s", m.getMediaAvaliacao());
    }
}
