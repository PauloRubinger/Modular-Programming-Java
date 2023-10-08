package sbbd.Coleções;

import java.util.ArrayList;

import sbbd.Profissional;

public class Profissionais {
    private static Profissionais instance;
    public ArrayList<Profissional> listaProfissionals;

    private Profissionais() {
        listaProfissionals = new ArrayList<Profissional>();
    }

    public static Profissionais getInstance() {
        if (instance == null)
            instance = new Profissionais();
        return instance;
    }

    public void adicionarProfissional(Profissional p_profissinal) {
        Profissionais.getInstance();
        instance.listaProfissionals.add(p_profissinal);
    }

    public void editarProfissional(Integer p_profissinalMatricula, Profissional p_profissinal) throws Exception {
        Profissionais.getInstance();
        Profissional v_returningProfissional = percorrerLista(p_profissinalMatricula);
        if (v_returningProfissional != null)
            v_returningProfissional = p_profissinal;
        throw new Exception("Não foi possível encontrar o profissional com a matrícula: " + p_profissinalMatricula);
    }

    public void excluirProfissional(Profissional p_profissinal) {
        Profissionais.getInstance();
        if (instance.listaProfissionals.contains(p_profissinal))
            instance.listaProfissionals.remove(p_profissinal);
    }

    public Profissional consultarProfissional(Integer p_profissinalMatricula) throws Exception {
        Profissionais.getInstance();
        Profissional v_returningProfissional = percorrerLista(p_profissinalMatricula);
        if (v_returningProfissional != null)
            return v_returningProfissional;
        throw new Exception("Não foi possível encontrar o profissional com a matrícula: " + p_profissinalMatricula);
    }

    private Profissional percorrerLista(Integer p_profissinalrMatricula) {
        for (Profissional t_instance : instance.listaProfissionals) {
            if (t_instance.getMatricula() == p_profissinalrMatricula)
                return t_instance;
        }
        return null;
    }
}
