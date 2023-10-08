package sbbd;

import java.sql.Time;

public class Apresentacao {
    private int id;
    private Time horaApresentacao;
    private String tema;
    private Trabalho trabalho;
    private SessaoTecnica sessaoTecnica;

    public Apresentacao(int id, Time horaApresentacao, String tema, Trabalho trabalho, SessaoTecnica sessaoTecnica) {
        this.id = id;
        this.horaApresentacao = horaApresentacao;
        this.tema = tema;
        this.trabalho = trabalho;
        this.sessaoTecnica = sessaoTecnica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getHoraApresentacao() {
        return horaApresentacao;
    }

    public void setHoraApresentacao(Time horaApresentacao) {
        this.horaApresentacao = horaApresentacao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public SessaoTecnica getSessaoTecnica() {
        return sessaoTecnica;
    }

    public void setSessaoTecnica(SessaoTecnica sessaoTecnica) {
        this.sessaoTecnica = sessaoTecnica;
    }
}
