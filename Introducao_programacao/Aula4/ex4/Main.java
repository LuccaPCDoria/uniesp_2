package Aula4.ex4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Imc i = new Imc();

        System.out.print("Digite o seu nome: ");
        i.setNome(sc1.nextLine());

        System.out.print("Digite sua altura: ");
        i.setAltura(sc2.nextDouble());

        System.out.print("Digite seu peso: ");
        i.setPeso(sc2.nextDouble());
        i.calcula_imc();
        System.out.printf("O indice de massa corporal de %s é %.2f",i.getNome(),i.getIndiceMC());

        sc1.close();
        sc2.close();
    }
}
