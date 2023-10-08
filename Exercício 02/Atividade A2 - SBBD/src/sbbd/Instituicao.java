package sbbd;

import java.util.Date;

public abstract class Instituicao {
    private int id;
    private String nome;
    private String cnpj;
    private Date fundacao;
    private String tipo; // Pode ser universidade ou empresa
    private int numeroDeFuncionarios;

    public Instituicao(int id, String nome, String cnpj, Date fundacao, String tipo, int numeroDeFuncionarios) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.fundacao = fundacao;
        this.tipo = tipo;
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Date getFundacao() {
        return fundacao;
    }
    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }
    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public abstract Minicurso oferecerMinicurso();

}
