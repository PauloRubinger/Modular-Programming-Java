package sbbd.colecoes;

import java.util.ArrayList;

import sbbd.Universidade;

public class Universidades {
    private static Universidades instance;
    public ArrayList<Universidade> listaUniversidades;

    private Universidades() {
        listaUniversidades = new ArrayList<>();
    }

    public static Universidades getInstance() {
        if (instance == null) {
            instance = new Universidades();
        }
        return instance;
    }

    public void adicionarUniversidade(Universidade universidade) {
        Universidades.getInstance();
        instance.listaUniversidades.add(universidade);
    }

    public void editarUniversidade(Integer id, Universidade universidade) throws Exception {
        Universidades.getInstance();
        Universidade returningUniversidade = percorrerLista(id);
        if (returningUniversidade != null)
            returningUniversidade = universidade;
        throw new Exception("Não foi possível encontrar a universidade com o id: " + id);
    }

    public void excluirUniversidade(Universidade universidade) {
        Universidades.getInstance();
        if (instance.listaUniversidades.contains(universidade))
            instance.listaUniversidades.remove(universidade);
    }

    public Universidade consultaruniversidade(Integer id) throws Exception {
        Universidades.getInstance();
        Universidade returningUniversidade = percorrerLista(id);
        if (returningUniversidade != null)
            return returningUniversidade;
        throw new Exception("Não foi possível encontrar a universidade com o id: " + id);
    }

    private Universidade percorrerLista(Integer id) {
        for (Universidade instance : instance.listaUniversidades) {
            if (instance.getId() == id)
                return instance;
        }
        return null;
    }
}
