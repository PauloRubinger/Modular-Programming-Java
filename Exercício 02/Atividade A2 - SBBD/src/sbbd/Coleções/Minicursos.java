package sbbd.Coleções;

import java.util.ArrayList;

import sbbd.Minicurso;

public class Minicursos {
    private static Minicursos instance;
    public ArrayList<Minicurso> listaMinicursos;

    private Minicursos() {
        listaMinicursos = new ArrayList<Minicurso>();
    }

    public static Minicursos getInstance() {
        if (instance == null)
            instance = new Minicursos();
        return instance;
    }

    public void adicionarMinicurso(Minicurso p_minicurso) {
        Minicursos.getInstance();
        instance.listaMinicursos.add(p_minicurso);
    }

    public void editarMinicurso(Integer p_minicursoId, Minicurso p_minicurso) throws Exception {
        Minicursos.getInstance();
        Minicurso v_returningMinicurso = percorrerLista(p_minicursoId);
        if (v_returningMinicurso != null)
            v_returningMinicurso = p_minicurso;
        throw new Exception("Não foi possível encontrar o mini curso com a matrícula: " + p_minicursoId);
    }

    public void excluirMinicurso(Minicurso p_minicurso) {
        Minicursos.getInstance();
        if (instance.listaMinicursos.contains(p_minicurso))
            instance.listaMinicursos.remove(p_minicurso);
    }

    public Minicurso consultarMinicurso(Integer p_minicursoId) throws Exception {
        Minicursos.getInstance();
        Minicurso v_returningMinicurso = percorrerLista(p_minicursoId);
        if (v_returningMinicurso != null)
            return v_returningMinicurso;
        throw new Exception("Não foi possível encontrar o mini curso com a matrícula: " + p_minicursoId);
    }

    private Minicurso percorrerLista(Integer p_minicusorId) {
        for (Minicurso t_instance : instance.listaMinicursos) {
            if (t_instance.getId() == p_minicusorId)
                return t_instance;
        }
        return null;
    }
}
