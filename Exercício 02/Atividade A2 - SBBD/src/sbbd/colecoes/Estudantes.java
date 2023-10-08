package sbbd.colecoes;

import java.util.ArrayList;

import sbbd.Estudante;

public class Estudantes {
    private static Estudantes instance;
    public ArrayList<Estudante> listaEstudantes;

    private Estudantes() {
        listaEstudantes = new ArrayList<Estudante>();
    }

    public static Estudantes getInstance() {
        if (instance == null)
            instance = new Estudantes();
        return instance;
    }

    public void adicionarEstudante(Estudante p_estudante) {
        Estudantes.getInstance();
        instance.listaEstudantes.add(p_estudante);
    }

    public void editarEstudante(Integer p_estudanteMatricula, Estudante p_estudante) throws Exception {
        Estudantes.getInstance();
        Estudante v_returningEstudante = percorrerLista(p_estudanteMatricula);
        if (v_returningEstudante != null)
            v_returningEstudante = p_estudante;
        throw new Exception("Não foi possível encontrar o estudante com a matrícula: " + p_estudanteMatricula);
    }

    public void excluirEstudante(Estudante p_estudante) {
        Estudantes.getInstance();
        if (instance.listaEstudantes.contains(p_estudante))
            instance.listaEstudantes.remove(p_estudante);
    }

    public Estudante consultarEstudante(Integer p_estudanteMatricula) throws Exception {
        Estudantes.getInstance();
        Estudante v_returningEstudante = percorrerLista(p_estudanteMatricula);
        if (v_returningEstudante != null)
            return v_returningEstudante;
        throw new Exception("Não foi possível encontrar o estudante com a matrícula: " + p_estudanteMatricula);
    }

    private Estudante percorrerLista(Integer p_estudanterMatricula) {
        for (Estudante t_instance : instance.listaEstudantes) {
            if (t_instance.getMatricula() == p_estudanterMatricula)
                return t_instance;
        }
        return null;
    }
}
