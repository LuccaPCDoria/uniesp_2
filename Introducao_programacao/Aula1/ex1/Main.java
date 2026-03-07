package Aula1.ex1;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("Questão 1");
        int horas = 40;
        int total;

        total = 40 * 15;

        System.out.println(total);
        //2
        System.out.println("Questão 2");
        int num1 = 20;
        int num2 = 40;
        String texto;
        if(num1 > num2){
            texto = "é maior";
        }else if (num1 == num2){
            texto = "é igual";
        }else {
            texto = "é menor";
        }
        System.out.println(texto);

        //3
        System.out.println("Questão 3");
        double nota1 = 34.00, nota2 = 35.00, nota3 = 10.00, media = 0;
        media = nota1 + nota2 + nota3 / 3;

        if(media >= 70 && media <= 100)
            System.out.println("Aprovado!");
        else if(media < 70 && media > 40)
            System.out.println("Final!");
        else if(media < 40 && media >= 0)
            System.out.println("Reprovado!");
        else
            System.out.println("A nota está com problemas");
        //4
        System.out.println("Questão 4!");

        double salario = 1500.00;
        double desconto;
        String textoDesconto;
        if (salario > 2500)
            textoDesconto = "de 20%";
        else if(salario > 1500 && salario <= 2500)
            textoDesconto = "de 10%";
        else if(salario > 900 && salario <= 1500)
            textoDesconto = "de 5%";
        else if(salario <= 900)
            textoDesconto = "isento";
        else
            textoDesconto = "desconto não calculado";

        System.out.printf("Seu salário de %f e o desconto é %s.\n",salario,textoDesconto);
    }
}
