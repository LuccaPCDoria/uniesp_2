package Aula4.ex4;

public class Imc {
    private String nome;
    private double peso, altura, indiceMC;

    public void calcula_imc(){
        indiceMC = peso / (altura * altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIndiceMC() {
        return indiceMC;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
