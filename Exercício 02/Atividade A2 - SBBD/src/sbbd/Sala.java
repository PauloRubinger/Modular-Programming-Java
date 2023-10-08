package sbbd;

import java.sql.Time;
import java.util.ArrayList;

public class Sala {
    Integer sala_codigo;
    Integer sala_idPredio;
    Integer sala_numero;
    ArrayList<Minicurso> sala_listaMiniCursos;
    ArrayList<SessaoTecnica> sala_listaSessaoTecninca;

    public Sala(Integer p_codigo, Integer p_idPredio) {
        sala_codigo = p_codigo;
        sala_idPredio = p_idPredio;
        sala_listaMiniCursos = new ArrayList<Minicurso>();
        sala_listaSessaoTecninca = new ArrayList<SessaoTecnica>();
    }

    public boolean salaOcupada(Time p_hora) {
        for (Minicurso t_instanceMiniCurso : sala_listaMiniCursos) {
            if (t_instanceMiniCurso.getHoraInicio().after(p_hora) && t_instanceMiniCurso.getHoraFim().before(p_hora))
                return true;
        }
        for (SessaoTecnica t_instanceSessaoParticular : sala_listaSessaoTecninca) {
            if (t_instanceSessaoParticular.getHoraInicio().after(p_hora)
                    && t_instanceSessaoParticular.getHoraFim().before(p_hora))
                return true;
        }
        return false;
    }

    public boolean salaOcupadaNow()
    {
        return salaOcupada(new Time(System.currentTimeMillis()));
    }

    public void incluirNovoMinicurso(Minicurso p_minicurso) throws Exception {
        if (!sala_listaMiniCursos.contains(p_minicurso))
            sala_listaMiniCursos.add(p_minicurso);
        else
            throw new Exception("MiniCurso já está existe na sala: " + sala_numero);
    }

    public void retirarMiniCurso(Minicurso p_minicurso) throws Exception {
        if (sala_listaMiniCursos.contains(p_minicurso))
            sala_listaMiniCursos.remove(p_minicurso);
        else
            throw new Exception("MiniCurso não estava acontendo na sala: " + sala_numero);
    }

    public Minicurso existeMiniCursoNaSala(Integer p_id) throws Exception {
        for (Minicurso t_instanceMiniCurso : sala_listaMiniCursos) {
            if (t_instanceMiniCurso.getId() == p_id)
                return t_instanceMiniCurso;
        }
        throw new Exception("MiniCurso não estava acontendo na sala: " + sala_numero);
    }

    public void incluirNovaSessaoTecnica(SessaoTecnica p_sessaotecnica) throws Exception {
        if (!sala_listaSessaoTecninca.contains(p_sessaotecnica))
            sala_listaSessaoTecninca.add(p_sessaotecnica);
        else
            throw new Exception("Sessão Técnica já está existe na sala: " + sala_numero);
    }

    public void retirarSessaoTecnica(SessaoTecnica p_sessaotecnica) throws Exception {
        if (sala_listaSessaoTecninca.contains(p_sessaotecnica))
            sala_listaSessaoTecninca.remove(p_sessaotecnica);
        else
            throw new Exception("Sessão Técnica não estava acontendo na sala: " + sala_numero);
    }

    public SessaoTecnica existeSessaoTecnicaNaSala(Integer p_id) throws Exception {
        for (SessaoTecnica t_instanceSessaoParticular : sala_listaSessaoTecninca) {
            if (t_instanceSessaoParticular.getId() == p_id)
                return t_instanceSessaoParticular;
        }
        throw new Exception("Sessão Técnica não estava acontendo na sala: " + sala_numero);
    }

    public Integer getCodigo() {
        return sala_codigo;
    }


}
