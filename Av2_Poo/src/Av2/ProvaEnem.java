package Av2;

public class ProvaEnem {
    private int id_prova, nota;
    private String titulo;

    public ProvaEnem(int id_prova, int nota, String titulo) {
        this.id_prova = id_prova;
        this.nota = nota;
        this.titulo = titulo;
    }

    public int getId_prova() {
        return id_prova;
    }

    public void setId_prova(int id_prova) {
        this.id_prova = id_prova;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
