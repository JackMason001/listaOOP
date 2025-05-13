package model;

public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Carro() {
    }

    public Carro(int id,String marca, String modelo, int anoFabricacao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    //Para criar o Carro carro6 = new Carro("Honda"); 'e necessario criar um construtor separado.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
