package Atv1;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;

    private ArrayList<Publicacao> publicacaos = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public void inserePublicacao(Publicacao pub) {
        publicacaos.add(pub);
        Publicacao.contadorPublicacao += 1.0;
    }

    public void imprimirPublicacao() {
        System.out.println("Quantidade de publicações: " + Publicacao.getContadorPublicacao());
        System.out.println("===========================================");
        for (Publicacao publicacao : publicacaos) {
            System.out.println("Texto: " + publicacao.getTextoPublicacao());
            System.out.println("Data: " + publicacao.getDataPublicacao());
            System.out.println("Link: " + publicacao.getLinkMidia());
            System.out.println("===========================================");
        }
    }
}
