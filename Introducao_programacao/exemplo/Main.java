package exemplo;
public class Main {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 40;
        int total;
        int multi;
        double division;
        int subtract;
        total = num1 + num2;
        multi = num1 * num2;
        division = num1 / num2;
        subtract = num1 - num2;
        // %d = exibir decimal com printf()
        // %f = exibir um numero flutuante no printf()
        // %s = exibir um texto no prinf()
        // %b = exibir um booleano no prinf()

        String texto;
        if(num1 > num2){
            texto = "é maior";
        }else if (num1 == num2){
            texto = "é igual";
        }else {
            texto = "é menor";
        }
        System.out.printf("O total da soma é: %d\n O total da subtração é: %d",total,subtract);
    }
}