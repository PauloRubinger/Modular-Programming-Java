package sbbd;

import java.util.ArrayList;

public class Trabalho {
    private int id;
    private String titulo;
    private String resumo;
    private String desenvolvimento;
    private String conclusao;
    private String[] referencias;
    private ArrayList<Estudante> autores;
    private Professor orientador;

    public Trabalho(int id, String titulo, String resumo, String desenvolvimento, String conclusao,
            String[] referencias, Professor orientador) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.desenvolvimento = desenvolvimento;
        this.conclusao = conclusao;
        this.referencias = referencias;
        this.autores = new ArrayList<>();
        this.orientador = orientador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDesenvolvimento() {
        return desenvolvimento;
    }

    public void setDesenvolvimento(String desenvolvimento) {
        this.desenvolvimento = desenvolvimento;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    public String[] getReferencias() {
        return referencias;
    }

    public void setReferencias(String[] referencias) {
        this.referencias = referencias;
    }

    public ArrayList<Estudante> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Estudante> autores) {
        this.autores = autores;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }
}
