
public class Destino {
    private String cidade;
    private String estado;
    private String pais;
    private String cidadeOrigem;
    private String estadoOrigem;
    private Double preco;
    
    public Destino(String cidade, String cidadeOrigem, String estado, String estadoOrigem, String pais, Double preco) {
        this.cidade = cidade;
        this.cidadeOrigem = cidadeOrigem;
        this.estado = estado;
        this.estadoOrigem = estadoOrigem;
        this.pais = pais;
        this.preco = preco;
    }
      
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }
    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }
    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }
    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }
    
    public String getPais() {
        return pais;
    }
    public void setNome(String pais) {
        this.pais = pais;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    
}

