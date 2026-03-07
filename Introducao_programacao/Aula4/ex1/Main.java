package Aula4.ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite seu nome: ");
        p.setNome(sc2.nextLine());

        System.out.println("Digite sua idade: ");
        p.setIdade(sc1.nextInt());

        System.out.println("Digite sua altura: ");
        p.setAltura(sc1.nextDouble());

        System.out.printf("A idade de %s é %d, e a altura é: %2f:.2f", p.getNome(), p.getIdade(), p.getAltura());

        sc1.close();
        sc2.close();
    }

}
