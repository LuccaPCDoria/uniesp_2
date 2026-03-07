package Aula4.ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Calculadora c = new Calculadora();

        System.out.println("Digite o primeiro valor: ");
        c.n1 = sc1.nextInt();

        System.out.println("Digite o segundo valor: ");
        c.n2 = sc1.nextInt();

        System.out.println(c.somar());

        sc1.close();
    }
}
