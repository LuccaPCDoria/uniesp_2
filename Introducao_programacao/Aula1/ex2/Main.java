package Aula1.ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = sc1.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = sc1.nextInt();

        if (num1 > num2) {
            System.out.printf("O primeiro numero [ %d ] é maior que o segundo numero [ %d ]", num1, num2);
        }
        else if(num1 == num2) {
            System.out.printf("O primeiro numero [ %d ] é igual ao segundo numero [ %d ]", num1, num2);
        }
        else{
            System.out.printf("O segundo numero [ %d ] é maior que o primeiro numero [ %d ]", num2, num1);
        }

    }
}
