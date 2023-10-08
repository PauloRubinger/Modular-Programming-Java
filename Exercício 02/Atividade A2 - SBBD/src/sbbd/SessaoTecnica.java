package sbbd;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class SessaoTecnica {
    private Integer sesTec_id;
    private String sesTec_nome;
    private Date sesTec_date;
    private Time sesTec_horaInicio;
    private Time sesTec_horaFim;
    private ArrayList<Pessoa> sesTec_participantes;
    private Professor sesTec_mediador;

    public SessaoTecnica(Integer p_id, String p_nome, Date p_date, Time p_horaInicio, Time p_horaFim,
            Professor p_mediador) {
        sesTec_id = p_id;
        sesTec_nome = p_nome;
        sesTec_date = p_date;
        sesTec_horaInicio = p_horaInicio;
        sesTec_horaFim = p_horaFim;
        sesTec_participantes = new ArrayList<Pessoa>();
        sesTec_mediador = p_mediador;
    }

    public void mudarMediador(Professor p_pessoa)
    {
        sesTec_mediador = p_pessoa;
    }

    public void incluirNovoParticipante(Pessoa p_pessoa) throws Exception {
        if (!sesTec_participantes.contains(p_pessoa))
            sesTec_participantes.add(p_pessoa);
        else
            throw new Exception("Pessoa já está incluida na Sessão Técninca: " + sesTec_nome);
    }

    public void excluirParticipante(Pessoa p_pessoa) throws Exception {
        if (sesTec_participantes.contains(p_pessoa))
            sesTec_participantes.remove(p_pessoa);
        else
            throw new Exception("Pessoa não estava incluída na Sessão Técninca: " + sesTec_nome);
    }

    public Pessoa consultarParticipanteEstaNoMinicurso(String p_cpf) throws Exception {
        for (Pessoa t_instancePessoa : sesTec_participantes) {
            if (t_instancePessoa.getCpf() == p_cpf)
                return t_instancePessoa;
        }
        throw new Exception("Pessoa não estava incluída na Sessão Técninca: " + sesTec_nome);
    }

    public Integer getId() {
        return sesTec_id;
    }

    public Time getHoraInicio() {
        return sesTec_horaInicio;
    }

    public Time getHoraFim() {
        return sesTec_horaFim;
    }

        public Date getSesTec_date() {
        return sesTec_date;
    }

    public void setSesTec_date(Date sesTec_date) {
        this.sesTec_date = sesTec_date;
    }

    public Professor getSesTec_mediador() {
        return sesTec_mediador;
    }

    public void setSesTec_mediador(Professor sesTec_mediador) {
        this.sesTec_mediador = sesTec_mediador;
    }
}
