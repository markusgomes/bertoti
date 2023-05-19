import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int cpf;
    private String cidadeOrig;
    private Calendar dataNascimento;
    
    public Pessoa(String nome, int cpf, String cidadeOrig, Calendar dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidadeOrig = cidadeOrig;
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

    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}

