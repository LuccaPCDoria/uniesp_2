package Aula3.ex1;

public class Empregado {
    String nomeCompleto;
    int matricula;
    double salarioBruto,salarioLiquido, descontoINSS = 0.15;

    void calcularDescontoSalario(){
        salarioLiquido = salarioBruto * descontoINSS;
    }

}
