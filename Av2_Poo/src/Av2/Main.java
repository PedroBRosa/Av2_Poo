package Av2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idProva,nota,notaApurada=0;
        int idAluno,ano;
        String titulo,nome;
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o ID do aluno: ");
        idAluno = ler.nextInt();
        System.out.println("Escreva o ano da prova: ");
        ano = ler.nextInt();
        System.out.println("Escreva o nome do aluno: ");
        nome = ler.next();
        System.out.println("=============================");
        AlunoEnem alunoEnem = new AlunoEnem(idAluno, ano,nome);
        ArrayList<ProvaEnem> prova = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Escreva o ID da prova: ");
            idProva = ler.nextInt();
            System.out.println("Escreva a nota da prova: ");
            nota = ler.nextInt();
            System.out.println("Escreva o titulo da prova: ");
            titulo = ler.next();
            System.out.println("=============================");
            prova.add(new ProvaEnem(idProva,nota,titulo));
        }
        for (ProvaEnem provaEnem:prova) {
            notaApurada+=provaEnem.getNota();
        }
        System.out.println("Apuração é: "+notaApurada);
    }
}
