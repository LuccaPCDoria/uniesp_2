package Aula4.ex5;

public class Produto {
    private int codigo, quant_estoque;
    private String nome, cor;
    private double peso, altura, indiceMC, valor;

    public void calcula_imc() {
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
