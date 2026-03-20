package Aula5.ex1;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        sc1.useLocale(Locale.forLanguageTag("pt-BR"));

        Aluno a = new Aluno("lucca", 123123, 19);
        Professor p = new Professor("Prof_lucca",18, 1500.00);

        System.out.println("Digite seu nome:" );
        a.setNome(sc1.nextLine());

        System.out.println("Digite sua idade:" );
        a.setIdade(sc2.nextInt());

        System.out.println("Digite sua matricula:" );
        a.setMatricula(sc2.nextInt());


        System.out.println();

        sc1.close();
        sc2.close();
    }

}
