import java.util.LinkedList;
import java.util.List;

public class AgenciaViagens {
    

    // PASSAGEIRO
    private List<Passageiro> passageiros = new LinkedList<Passageiro>();

    public void cadastrarPessoa(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public Passageiro buscarPassageiroPorCpf(int cpf) {
        for(Passageiro passageiro:passageiros){
            if(passageiro.getCpf() == cpf){
                return passageiro;
            } else {
                return null;
            }
        } 
        return null;
    }

    public List<Passageiro> getPassageiros(){
        return this.passageiros;
    }


   // DESTINO
    private List<Destino> destinos = new LinkedList<Destino>();

    public void cadastrarDestino(Destino destino) {
        destinos.add(destino);
    }

    public Destino buscarDestinoPorCidade(String cidade) {
        for(Destino destino:destinos){
            if(destino.getCidade().equals(cidade)){
                return destino;
            } else {
                return null;
            }
        }
        return null;
    }

    public List<Destino> getDestinos(){
        return this.destinos;
    }


    // TRANSPORTE
}

