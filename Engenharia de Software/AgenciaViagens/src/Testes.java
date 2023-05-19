import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Calendar;


public class Testes {
    @Test
    public void testar() {
        AgenciaViagens agenciaViagens = new AgenciaViagens();
        assertEquals(agenciaViagens.getPessoas().size(), 0);

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(1990, Calendar.JANUARY,1);

       agenciaViagens.cadastrarPessoa(new Pessoa("Markus", 999999999, "SJC_SP", dataNascimento));
       agenciaViagens.cadastrarPessoa(new Pessoa("Vinicius", 888888888, "EUN_BA", dataNascimento));
       agenciaViagens.cadastrarPessoa(new Pessoa("Gomes", 777777777, "BPS_BA", dataNascimento));
       agenciaViagens.cadastrarPessoa(new Pessoa("Santos", 666666666, "RIO_RJ", dataNascimento));
    
        
       assertEquals(agenciaViagens.getPessoas().size(), 4);

       Pessoa pessoaEncontrada = agenciaViagens.buscarPessoaPorCpf(999999999);
       assertEquals(pessoaEncontrada.getCidadeOrig(), "SJC_SP");    
    }
}
