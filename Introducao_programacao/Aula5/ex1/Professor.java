package Aula5.ex1;

public class Professor extends Pessoa{

    private double salario;


    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void calcularSalario(){
        salario = 300 * 40;
    }

// get e set
}
