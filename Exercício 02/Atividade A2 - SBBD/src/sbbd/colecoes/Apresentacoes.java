package sbbd.colecoes;

import java.util.ArrayList;

import sbbd.Apresentacao;

public class Apresentacoes {
    private static Apresentacoes instance;
    public ArrayList<Apresentacao> listaApresentacoes;

    private Apresentacoes() {
        listaApresentacoes = new ArrayList<>();
    }

    public static Apresentacoes getInstance() {
        if (instance == null) {
            instance = new Apresentacoes();
        }
        return instance;
    }

    public void adicionarApresentacao(Apresentacao apresentacao) {
        Apresentacoes.getInstance();
        instance.listaApresentacoes.add(apresentacao);
    }

    public void editarApresentacao(Integer id, Apresentacao apresentacao) throws Exception {
        Apresentacoes.getInstance();
        Apresentacao returningApresentacao = percorrerLista(id);
        if (returningApresentacao != null)
            returningApresentacao = apresentacao;
        throw new Exception("Não foi possível encontrar a apresentação com o id: " + id);
    }

    public void excluirApresentacao(Apresentacao apresentacao) {
        Apresentacoes.getInstance();
        if (instance.listaApresentacoes.contains(apresentacao))
            instance.listaApresentacoes.remove(apresentacao);
    }

    public Apresentacao consultarApresentacao(Integer id) throws Exception {
        Apresentacoes.getInstance();
        Apresentacao returningApresentacao = percorrerLista(id);
        if (returningApresentacao != null)
            return returningApresentacao;
        throw new Exception("Não foi possível encontrar a apresentação com o id: " + id);
    }

    private Apresentacao percorrerLista(Integer id) {
        for (Apresentacao instance : instance.listaApresentacoes) {
            if (instance.getId() == id)
                return instance;
        }
        return null;
    }
}
