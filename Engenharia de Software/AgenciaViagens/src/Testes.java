import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Calendar;
//import java.util.List;


public class Testes {

    @Test
    public void testesPassageiro() {
        
        AgenciaViagens agenciaViagens = new AgenciaViagens();
        assertEquals(agenciaViagens.getPassageiros().size(), 0);

        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(1990, Calendar.JANUARY,1);

       agenciaViagens.cadastrarPessoa(new Passageiro("Markus", 999999999, "SJC", "SP", dataNascimento));
       agenciaViagens.cadastrarPessoa(new Passageiro("Vinicius", 888888888, "RIO", "RJ", dataNascimento));
       agenciaViagens.cadastrarPessoa(new Passageiro("Gomes", 777777777, "São Paulo", "SP", dataNascimento));
       agenciaViagens.cadastrarPessoa(new Passageiro("Santos", 666666666, "Porto Seguro", "BA", dataNascimento));
       assertEquals(agenciaViagens.getPassageiros().size(), 4);

       Passageiro pessoaEncontrada = agenciaViagens.buscarPassageiroPorCpf(999999999);
       assertEquals(pessoaEncontrada.getCidadeOrig(), "SJC");

    }


    @Test
    public void testesDestino() {

        AgenciaViagens agenciaViagens = new AgenciaViagens();
        assertEquals(agenciaViagens.getDestinos().size(), 0);

        agenciaViagens.cadastrarDestino(new Destino("Porto Alegre", "SJC", "RS", "SP", "BR", 187.39));
        agenciaViagens.cadastrarDestino(new Destino("Natal", "RIO", "RN", "RJ", "BR", 489.39));
        agenciaViagens.cadastrarDestino(new Destino("São Francisco", "São Paulo", "California", "SP", "EUA", 5689.6));
        assertEquals(agenciaViagens.getDestinos().size(), 3);

        Destino destinoEncontrado = agenciaViagens.buscarDestinoPorCidade("Porto Alegre");
        assertEquals(destinoEncontrado.getEstado(),"RS");

        /*List<Destino> destinoEncontrados = agenciaViagens.buscarDestinoPorCidade("Porto Alegre");
        assertEquals(destinoEncontrados.get(0).getPais(), 1);*/
    }
}
