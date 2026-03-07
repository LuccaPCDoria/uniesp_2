package Aula1.ex3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        System.out.println("Digite a primeira nota: ");
        nota1 = sc1.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc1.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc1.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 70){
            System.out.println("Aprovado!");
        } else if (media < 40) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Final!");
        }

        System.out.printf("A media é: %f", media);
    }
}
