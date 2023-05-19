import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Calendar;


public class Testes {

    @Test
    public void testesPassageiro() {
        
        AgenciaViagens agenciaViagens = new AgenciaViagens();
        assertEquals(agenciaViagens.getPassageiros().size(), 0);

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(1990, Calendar.JANUARY,1);

       agenciaViagens.cadastrarPessoa(new Passageiro("Markus", 999999999, "SJC_SP", dataNascimento));
       agenciaViagens.cadastrarPessoa(new Passageiro("Vinicius", 888888888, "EUN_BA", dataNascimento));
       agenciaViagens.cadastrarPessoa(new Passageiro("Gomes", 777777777, "BPS_BA", dataNascimento));
       agenciaViagens.cadastrarPessoa(new Passageiro("Santos", 666666666, "RIO_RJ", dataNascimento));
       assertEquals(agenciaViagens.getPassageiros().size(), 4);

       Passageiro pessoaEncontrada = agenciaViagens.buscarPassageiroPorCpf(999999999);
       assertEquals(pessoaEncontrada.getCidadeOrig(), "SJC_SP");
    }


    @Test
    public void testesDestino(){
        AgenciaViagens agenciaViagens = new AgenciaViagens();
        assertEquals(agenciaViagens.getDestinos().size(), 0);

        agenciaViagens.cadastrarDestino(new Destino("New York", "NY", "EUA"));
        agenciaViagens.cadastrarDestino(new Destino("Porto Alegre", "RS", "BR"));
        agenciaViagens.cadastrarDestino(new Destino("Roma", "E.R.", "ITA"));
        assertEquals(agenciaViagens.getDestinos().size(), 3);

        Destino destinoEncontrado = agenciaViagens.buscarDestinoPorCidade("New York");
        assertEquals(destinoEncontrado.getPais(),"EUA");
    }
    
}
