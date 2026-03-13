package Aula4.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Produto p = new Produto();

        System.out.println("Seja bem vindo a loja do Lucca: ");
        System.out.println("Se deseja cadastrar um produto digite (1):\nSe deseja comprar um produto digite (2):\nSe deseja sair digite (3):");
        int opt = sc2.nextInt();
        while(opt != 3){
            System.out.println("Se deseja cadastrar um produto digite (1):\nSe deseja comprar um produto digite (2):\nSe deseja sair digite (3):");
            opt = sc2.nextInt();
            if(opt == 1){
                System.out.print("Digite o código do produto: ");
                p.setCodigo(sc2.nextInt());

                System.out.print("Digite o nome do produto: ");
                p.setNome(sc1.nextLine());

                System.out.print("Digite o tamanho do produto: ");
                p.setTamanho(sc2.nextDouble());

                System.out.print("Digite o peso do produto: ");
                p.setPeso(sc2.nextDouble());

                System.out.print("Digite a cor do produto: ");
                p.setCor(sc1.nextLine());

                System.out.print("Digite o valor do produto: ");
                p.setValor(sc2.nextDouble());

                System.out.print("Digite a quantidade em estoque do produto: ");
                p.setQuant_estoque(sc2.nextInt());
            }
            else if(opt == 2){
                System.out.println("Qual a forma de pagamento: \n1 -> debito\n2 -> pix\n3 -> dinheiro\n4 -> crédito");
                int fm = sc2.nextInt();
                System.out.println("Qual é o valor: ");
                double valor = sc2.nextDouble();
                p.formato_pagamento(fm, valor);
            }
            else{
                System.out.println("Opção invalida! Tente novamente.");
            }
        }
        System.out.println("Saiu do sistema");




        sc1.close();
        sc2.close();
    }
}
