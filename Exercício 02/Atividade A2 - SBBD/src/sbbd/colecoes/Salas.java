package sbbd.colecoes;

import java.util.ArrayList;

import sbbd.Sala;

public class Salas {
    private static Salas instance;
    public ArrayList<Sala> listaSalas;

    private Salas() {
        listaSalas = new ArrayList<Sala>();
    }

    public static Salas getInstance() {
        if (instance == null)
            instance = new Salas();
        return instance;
    }

    public void adicionarSala(Sala p_sala) {
        Salas.getInstance();
        instance.listaSalas.add(p_sala);
    }

    public void editarSala(Integer p_salaId, Sala p_sala) throws Exception {
        Salas.getInstance();
        Sala v_returningSala = percorrerLista(p_salaId);
        if (v_returningSala != null)
            v_returningSala = p_sala;
        throw new Exception("Não foi possível encontrar o sessão técnica com a matrícula: " + p_salaId);
    }

    public void excluirSala(Sala p_sala) {
        Salas.getInstance();
        if (instance.listaSalas.contains(p_sala))
            instance.listaSalas.remove(p_sala);
    }

    public Sala consultarSala(Integer p_salaId) throws Exception {
        Salas.getInstance();
        Sala v_returningSala = percorrerLista(p_salaId);
        if (v_returningSala != null)
            return v_returningSala;
        throw new Exception("Não foi possível encontrar o sessão técnica com a matrícula: " + p_salaId);
    }

    private Sala percorrerLista(Integer p_salaId) {
        for (Sala t_instance : instance.listaSalas) {
            if (t_instance.getCodigo() == p_salaId)
                return t_instance;
        }
        return null;
    }
}
