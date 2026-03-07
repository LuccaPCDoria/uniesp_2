package Aula4.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Digite o código do produto: ");
        p.setNome(sc1.nextLine());

        System.out.print("Digite sua altura: ");
        p.setAltura(sc2.nextDouble());

        System.out.print("Digite seu peso: ");
        p.setPeso(sc2.nextDouble());
        p.calcula_imc();
        System.out.printf("O indice de massa corporal de %s é %.2f", p.getNome(), p.getIndiceMC());

        sc1.close();
        sc2.close();
    }
}
