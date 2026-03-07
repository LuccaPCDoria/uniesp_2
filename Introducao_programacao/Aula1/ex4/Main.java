package Aula1.ex4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        double salario = sc1.nextDouble();

        if (salario > 2500) {
            System.out.println("Desconto de 20%");
        }else if (salario <= 2500 && salario >= 1501){
            System.out.println("Desconto de 10%");
        } else if (salario <= 1500 && salario >= 901 ){
            System.out.println("Desconto de 5%");
        } else{
            System.out.println("Isento");
        }
    }
}
