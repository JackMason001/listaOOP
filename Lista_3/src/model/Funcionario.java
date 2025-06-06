package model;

public abstract class Funcionario {
    protected String nome; //# no UML significa protected
    protected double salario;

    //construtores

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //getters e sedders


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonus();//Bonus esta em italico no diagrama indicando que é abstrato
}
