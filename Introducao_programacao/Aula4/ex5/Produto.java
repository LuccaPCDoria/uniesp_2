package Aula4.ex5;

public class Produto {

    private int codigo, quant_estoque;
    private String nome, cor;
    private double peso, valor, tamanho;

    public int getCodigo() {
        return codigo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuant_estoque() {
        return quant_estoque;
    }

    public void setQuant_estoque(int quant_estoque) {
        this.quant_estoque = quant_estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String formato_pagamento(int forma_pagar, double valor){
        if(forma_pagar == 1) return debito(valor);
        else if (forma_pagar == 2) return pix(valor);
        else if (forma_pagar == 3) return dinheiro(valor);
        else if(forma_pagar == 4) return credito(valor);
        else return "Forma de pagamento invalida!";
    }
    public String debito(double valor) {
        System.out.println("A opção deseja foi debito e você recebeu 5% de desconto");
        if (valor > this.valor) return "Pagamento realizado com sucesso";
        else return "Saldo não suficiente";
    }
    public String pix(double valor) {
        System.out.println("A opção deseja foi pix e você recebeu 5% de desconto");
        if (valor > this.valor) return "Pagamento realizado com sucesso!";
        else return "Saldo não suficiente";
    }
    public String dinheiro(double valor) {
        System.out.println("A opção deseja foi dinheiro e você recebeu 5% de desconto.");
        double troco = 0;
        if (valor > this.valor) {
            troco = valor - (this.valor - (this.valor * 0.05));
            return "Pagamento realizado com sucesso!\nSeu troco é: R$" + troco;
        }else return "Saldo não suficiente";
    }
    public String credito(double valor) {
        System.out.println("A opção deseja foi credito e você pode parcelar até 3x sem juros.");
        double total = this.valor / 3;
        if (valor > total) return "Pagamento realizado com sucesso!";
        else return "Saldo não suficiente";
    }
}
