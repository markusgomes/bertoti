import java.util.LinkedList;
import java.util.List;

public class AgenciaViagens {
    
    private List<Pessoa> pessoas = new LinkedList<Pessoa>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public Pessoa buscarPessoaPorCpf(int cpf) {
        for(Pessoa pessoa:pessoas){
            if(pessoa.getCpf() == cpf){
                return pessoa;
            } else {
                return null;
            }
        } 
        return null;
    }

    public List<Pessoa> getPessoas(){
        return this.pessoas;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
