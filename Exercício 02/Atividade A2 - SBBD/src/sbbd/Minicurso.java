package sbbd;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Minicurso {
    private Integer minic_id;
    private String minic_nome;
    private Date minic_date;
    private Time minic_horaInicio;
    private Time minic_horaFim;
    private ArrayList<Pessoa> minic_participantes;
    private Profissional minic_ministrante;

    public Minicurso(Integer p_id, String p_nome, Date p_date, Time p_horaInicio, Time p_horaFim,
            Profissional p_ministrante) {
        minic_id = p_id;
        minic_nome = p_nome;
        minic_date = p_date;
        minic_horaInicio = p_horaInicio;
        minic_horaFim = p_horaFim;
        minic_participantes = new ArrayList<Pessoa>();
        minic_ministrante = p_ministrante;
    }

    public void mudarMinistrante(Profissional p_pessoa)
    {
        minic_ministrante = p_pessoa;
    }

    public void incluirNovoParticipante(Pessoa p_pessoa) throws Exception {
        if (!minic_participantes.contains(p_pessoa))
            minic_participantes.add(p_pessoa);
        else
            throw new Exception("Pessoa já está incluida no mini curso: " + minic_nome);
    }

    public void excluirParticipante(Pessoa p_pessoa) throws Exception {
        if (minic_participantes.contains(p_pessoa))
            minic_participantes.remove(p_pessoa);
        else
            throw new Exception("Pessoa não estava incluída no mini curso: " + minic_nome);
    }

    public Pessoa consultarParticipanteEstaNoMinicurso(String p_cpf) throws Exception {
        for (Pessoa t_instancePessoa : minic_participantes) {
            if (t_instancePessoa.getCpf() == p_cpf)
                return t_instancePessoa;
        }
        throw new Exception("Pessoa não estava incluída no mini curso: " + minic_nome);
    }

    public Integer getId() {
        return minic_id;
    }

    public Time getHoraInicio() {
        return minic_horaInicio;
    }

    public Time getHoraFim() {
        return minic_horaFim;
    }

}
