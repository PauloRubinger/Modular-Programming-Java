package sbbd;

import java.util.ArrayList;
import java.util.Date;

public class Empresa extends Instituicao {
    private int id;
    private String areaAtuacao;
    private String missao;
    private String valores;
    private double receita;
    private ArrayList<Minicurso> minicursos;

    public Empresa(int idInstituicao, String nome, String cnpj, Date fundacao, String tipo, int numeroDeFuncionarios, int id, String areaAtuacao, String missao, String valores, double receita) {
        super(idInstituicao, nome, cnpj, fundacao, tipo, numeroDeFuncionarios);
        this.id = id;
        this.areaAtuacao = areaAtuacao;
        this.missao = missao;
        this.valores = valores;
        this.receita = receita;
        this.minicursos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public ArrayList<Minicurso> getMinicursos() {
        return minicursos;
    }

    public void setMinicursos(ArrayList<Minicurso> minicursos) {
        this.minicursos = minicursos;
    }

    @Override
    public Minicurso oferecerMinicurso() {
        return new Minicurso();
    }
}
