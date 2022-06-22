package Av2;

public class AlunoEnem {
    private int id_aluno, ano;
    private String nome;

    public AlunoEnem(int id_aluno, int ano, String nome) {
        this.id_aluno = id_aluno;
        this.ano = ano;
        this.nome = nome;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
