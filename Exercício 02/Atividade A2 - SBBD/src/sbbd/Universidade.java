package sbbd;

import java.util.Date;
import java.util.ArrayList;

public class Universidade extends Instituicao {

    private int id;
    private int numeroDeEstudantes;
    private ArrayList<Estudante> estudantes;
    private ArrayList<Professor> professores;
    private ArrayList<Minicurso> minicursos;

    public Universidade(int idInstituicao, String nome, String cnpj, Date fundacao, String tipo, int numeroDeFuncionarios, int id, int numeroDeEstudantes) {
        super(idInstituicao, nome, cnpj, fundacao, tipo, numeroDeFuncionarios);
        this.id = id;
        this.numeroDeEstudantes = numeroDeEstudantes;
        this.estudantes = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumeroDeEstudantes() {
        return numeroDeEstudantes;
    }
    public void setNumeroDeEstudantes(int numeroDeEstudantes) {
        this.numeroDeEstudantes = numeroDeEstudantes;
    }
    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }
    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Minicurso> getMinicursos() {
        return minicursos;
    }

    public void setMinicursos(ArrayList<Minicurso> minicursos) {
        this.minicursos = minicursos;
    }

}
