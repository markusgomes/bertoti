
public class Carro {

    private String Modelo;
    private String Marca;
    private String Cor;
    private String Cidade;   
    private int Ano;


    public Carro(String Modelo, String Marca, String Cor, String Cidade, int Ano) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Cor = Cor;
        this.Cidade = Cidade;
        this.Ano = Ano;
    }

    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getCor() {
        return Cor;
    }
    public void setCor(String cor) {
        Cor = cor;
    }

    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public int getAno() {
        return Ano;
    }
    public void setAno(int ano) {
        Ano = ano;
    }

    
}
