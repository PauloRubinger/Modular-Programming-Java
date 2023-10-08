package sbbd.colecoes;

import java.util.ArrayList;

import sbbd.Empresa;

public class Empresas {
    private static Empresas instance;
    public ArrayList<Empresa> listaEmpresas;

    private Empresas() {
        listaEmpresas = new ArrayList<Empresa>();
    }

    public static Empresas getInstance() {
        if (instance == null)
            instance = new Empresas();
        return instance;
    }

    public void adicionarEmpresa(Empresa p_empresa) {
        Empresas.getInstance();
        instance.listaEmpresas.add(p_empresa);
    }

    public void editarEmpresa(Integer p_empresaId, Empresa p_empresa) throws Exception {
        Empresas.getInstance();
        Empresa v_returningEmpresa = percorrerLista(p_empresaId);
        if (v_returningEmpresa != null)
            v_returningEmpresa = p_empresa;
        throw new Exception("Não foi possível encontrar a empresa com o id: " + p_empresaId);
    }

    public void excluirEmpresa(Empresa p_empresa) {
        Empresas.getInstance();
        if (instance.listaEmpresas.contains(p_empresa))
            instance.listaEmpresas.remove(p_empresa);
    }

    public Empresa consultarEmpresa(Integer p_empresaId) throws Exception {
        Empresas.getInstance();
        Empresa v_returningEmpresa = percorrerLista(p_empresaId);
        if (v_returningEmpresa != null)
            return v_returningEmpresa;
        throw new Exception("Não foi possível encontrar a empresa com o id: " + p_empresaId);
    }

    private Empresa percorrerLista(Integer p_empresaId) {
        for (Empresa t_instance : instance.listaEmpresas) {
            if (t_instance.getId() == p_empresaId)
                return t_instance;
        }
        return null;
    }
}
