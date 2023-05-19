import java.util.Calendar;

public class Passageiro {
    private String nome;
    private int cpf;
    private String cidadeOrig;
    private String estadoOrigem;
    private Calendar dataNascimento;
    
    public Passageiro(String nome, int cpf, String cidadeOrig, String estadoOrigem, Calendar dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidadeOrig = cidadeOrig;
        this.estadoOrigem = estadoOrigem;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getCidadeOrig() {
        return cidadeOrig;
    }
    public void setCidadeOrig(String cidadeOrig) {
        this.cidadeOrig = cidadeOrig;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }
    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}

