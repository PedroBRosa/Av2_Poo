package Atv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dataCriacao;
        String nomeUsuario;
        String dataNascimento;
        String senha;
        String dataPublicacao;
        String textoPublicacao;
        String linkMidia;
        Scanner ler = new Scanner(System.in);
        System.out.println("=========Cadastro=========");
        System.out.println("Escreva seu nome: ");
        nomeUsuario = ler.nextLine();
        System.out.println("Data de nascimento: ");
        dataNascimento = ler.next();
        System.out.println("Senha: ");
        senha = ler.next();
        System.out.println("Data de hoje: ");
        dataCriacao = ler.next();
        RedeSocial redeSocial = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento,senha);
        System.out.println("=========Você deve realizar duas publicações=========");

        for (int i = 0; i <2 ; i++) {

            System.out.println("Escreva o texto da publicação: ");
            textoPublicacao = ler.next();
            System.out.println("Ecreva o link da midia: ");
            linkMidia = ler.next();
            System.out.println("Escreva a data da publicação: ");
            dataPublicacao = ler.next();
            redeSocial.inserePublicacao(new Publicacao(dataPublicacao,textoPublicacao,linkMidia));
        }
        redeSocial.imprimirPublicacao();
    }
}
