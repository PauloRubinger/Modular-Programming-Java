package sbbd;

public abstract class Pessoa {
    protected Integer pes_matricula;
    protected String pes_cpf;
    protected String pes_nome;
    protected String pes_email;
    protected String pes_telefone;


    public void setMatricula(Integer p_matricula) {
        pes_matricula = p_matricula;
    }

    public void setCpf(String p_cpf) {
        pes_cpf = p_cpf;
    }

    public void setPNome(String p_nome) {
        pes_nome = p_nome;
    }

    public void setEmail(String p_email) {
        pes_email = p_email;
    }

    public void setTelefone(String p_telefone) {
        pes_telefone = p_telefone;
    }

    public Integer getMatricula() {
        return pes_matricula;
    }


    public String getCpf() {
        return pes_cpf;
    }


    public String getNome() {
        return pes_nome;
    }


    public String getEmail() {
        return pes_email;
    }


    public String getTelefone() {
        return pes_telefone;
    }
    
}
