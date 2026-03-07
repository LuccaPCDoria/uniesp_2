package Aula2.ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double peso, altura, imc;
        System.out.print("Digite seu peso: ");
        peso = sc1.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = sc1.nextDouble();

        imc = peso / (altura * altura);

        if (imc > 30) {
            System.out.println("Classificação: Obesidade!");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso!");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Normal!");
        } else {
            System.out.println("Classificação: Baixo peso!");
        }
    }
}
