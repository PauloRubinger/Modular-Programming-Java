package sbbd.colecoes;

import java.util.ArrayList;

import sbbd.Trabalho;

public class Trabalhos {
    private static Trabalhos instance;
    public ArrayList<Trabalho> listaTrabalhos;

    private Trabalhos() {
        listaTrabalhos = new ArrayList<>();
    }

    public static Trabalhos getInstance() {
        if (instance == null) {
            instance = new Trabalhos();
        }
        return instance;
    }

    public void adicionarTrabalho(Trabalho trabalho) {
        Trabalhos.getInstance();
        instance.listaTrabalhos.add(trabalho);
    }

    public void editarTrabalho(Integer id, Trabalho trabalho) throws Exception {
        Trabalhos.getInstance();
        Trabalho returningTrabalho = percorrerLista(id);
        if (returningTrabalho != null)
            returningTrabalho = trabalho;
        throw new Exception("Não foi possível encontrar o trabalho com o id: " + id);
    }

    public void excluirTrabalho(Trabalho trabalho) {
        Trabalhos.getInstance();
        if (instance.listaTrabalhos.contains(trabalho))
            instance.listaTrabalhos.remove(trabalho);
    }

    public Trabalho consultarTrabalho(Integer id) throws Exception {
        Trabalhos.getInstance();
        Trabalho returningTrabalho = percorrerLista(id);
        if (returningTrabalho != null)
            return returningTrabalho;
        throw new Exception("Não foi possível encontrar o trabalho com o id: " + id);
    }

    private Trabalho percorrerLista(Integer id) {
        for (Trabalho instance : instance.listaTrabalhos) {
            if (instance.getId() == id)
                return instance;
        }
        return null;
    }
}
