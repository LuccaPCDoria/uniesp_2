package Aula4.ex3;
import javax.script.ScriptContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.print("Digite o seu nome: ");
        f.setNome(sc1.nextLine());

        System.out.print("Digite quanto recebe por hora: ");
        f.setValorHora(sc2.nextDouble());

        System.out.print("Digite quantas horas trabalhou: ");
        f.setHorasTrabalhadas(sc2.nextInt());

        System.out.printf("O salário de %s é %.2f",f.getNome(),f.calculaSalario());

        sc1.close();
        sc2.close();
    }
}
