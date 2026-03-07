package Aula3.exemplo_pratico.ex2;
import java.util.Scanner;
public class Main {
    static void main(String [] args) {
        Scanner sc1 = new Scanner(System.in);
        Calculadora c = new Calculadora();
        System.out.print("Digite o primeiro valor que deseja somar: ");
        c.n1 = sc1.nextInt();
        System.out.print("Digite o segundo valor que deseja somar: ");
        c.n2 = sc1.nextInt();

        System.out.printf("O valor total da soma é: %d", c.soma());


        sc1.close();
    }
}
