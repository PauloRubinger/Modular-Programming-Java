package sbbd.colecoes;

import java.util.ArrayList;

import sbbd.SessaoTecnica;

public class SessoesTecnicas {
    private static SessoesTecnicas instance;
    public ArrayList<SessaoTecnica> listaSessoesTecnicas;

    private SessoesTecnicas() {
        listaSessoesTecnicas = new ArrayList<SessaoTecnica>();
    }

    public static SessoesTecnicas getInstance() {
        if (instance == null)
            instance = new SessoesTecnicas();
        return instance;
    }

    public void adicionarSessaoTecnica(SessaoTecnica p_sessaotecnica) {
        SessoesTecnicas.getInstance();
        instance.listaSessoesTecnicas.add(p_sessaotecnica);
    }

    public void editarSessaoTecnica(Integer p_sessaotecnicaId, SessaoTecnica p_sessaotecnica) throws Exception {
        SessoesTecnicas.getInstance();
        SessaoTecnica v_returningSessaoTecnica = percorrerLista(p_sessaotecnicaId);
        if (v_returningSessaoTecnica != null)
            v_returningSessaoTecnica = p_sessaotecnica;
        throw new Exception("Não foi possível encontrar o sessão técnica com a matrícula: " + p_sessaotecnicaId);
    }

    public void excluirSessaoTecnica(SessaoTecnica p_sessaotecnica) {
        SessoesTecnicas.getInstance();
        if (instance.listaSessoesTecnicas.contains(p_sessaotecnica))
            instance.listaSessoesTecnicas.remove(p_sessaotecnica);
    }

    public SessaoTecnica consultarSessaoTecnica(Integer p_sessaotecnicaId) throws Exception {
        SessoesTecnicas.getInstance();
        SessaoTecnica v_returningSessaoTecnica = percorrerLista(p_sessaotecnicaId);
        if (v_returningSessaoTecnica != null)
            return v_returningSessaoTecnica;
        throw new Exception("Não foi possível encontrar o sessão técnica com a matrícula: " + p_sessaotecnicaId);
    }

    private SessaoTecnica percorrerLista(Integer p_sessaotecnicaId) {
        for (SessaoTecnica t_instance : instance.listaSessoesTecnicas) {
            if (t_instance.getId() == p_sessaotecnicaId)
                return t_instance;
        }
        return null;
    }
}
