package Aula3.exemplo_pratico.ex1;
import java.util.Scanner;
public class Main {
    static void main(String [] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("Digite o seu nome: ");
        p.nome = sc2.nextLine();
        System.out.print("Digite a sua idade: ");
        p.idade = sc1.nextInt();

        System.out.printf("Idade do %s antiga: %d\n",p.nome, p.idade);
        p.fazAniversario();
        System.out.printf("Idade do %s atualizada: %d\n",p.nome, p.idade);
        sc1.close();
        sc2.close();
    }


}
