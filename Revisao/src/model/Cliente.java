package model;

public class Cliente implements Associado{
    private String nome;
    private int qtdeCotas;

    public Cliente() {
    }

    public Cliente(String nome, int qtdeCotas) {
        this.nome = nome;
        this.qtdeCotas = qtdeCotas;
    }

    @Override
    public int qtdeCotas() {
        return 0;
    }

    public int getQtdeCotas() {
        return qtdeCotas;
    }

    public void setQtdeCotas(int qtdeCotas) {
        this.qtdeCotas = qtdeCotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", qtdeCotas=" + qtdeCotas +
                '}';
    }
}
