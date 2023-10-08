package sbbd.colecoes;

import java.util.ArrayList;

import sbbd.Professor;

public class Professores {
    private static Professores instance;
    public ArrayList<Professor> listaProfessores;

    private Professores() {
        listaProfessores = new ArrayList<Professor>();
    }

    public static Professores getInstance() {
        if (instance == null)
            instance = new Professores();
        return instance;
    }

    public void adicionarProfessor(Professor p_professor) {
        Professores.getInstance();
        instance.listaProfessores.add(p_professor);
    }

    public void editarProfessor(Integer p_professorMatricula, Professor p_professor) throws Exception {
        Professores.getInstance();
        Professor v_returningProfessor = percorrerLista(p_professorMatricula);
        if (v_returningProfessor != null)
            v_returningProfessor = p_professor;
        throw new Exception("Não foi possível encontrar o professor com a matrícula: " + p_professorMatricula);
    }

    public void excluirProfessor(Professor p_professor) {
        Professores.getInstance();
        if (instance.listaProfessores.contains(p_professor))
            instance.listaProfessores.remove(p_professor);
    }

    public Professor consultarProfessor(Integer p_professorMatricula) throws Exception {
        Professores.getInstance();
        Professor v_returningProfessor = percorrerLista(p_professorMatricula);
        if (v_returningProfessor != null)
            return v_returningProfessor;
        throw new Exception("Não foi possível encontrar o professor com a matrícula: " + p_professorMatricula);
    }

    private Professor percorrerLista(Integer p_professorMatricula) {
        for (Professor t_instance : instance.listaProfessores) {
            if (t_instance.getMatricula() == p_professorMatricula)
                return t_instance;
        }
        return null;
    }
}
