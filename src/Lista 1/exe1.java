import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Q__u_e_st_ã_o_1_________________________________________________
Você trabalha em um supermercado e no caixa que você trabalha o consumidor só pode comprar
um único produto, mesmo que várias unidades repetidas. Você deseja otimizar o seu trabalho e
criar um programa que leia o preço do produto e a quantidade de itens comprados e informe o
total da compra para o usuário

    deseja: otimizar o trbalho
    criar: um programa
    leia:

         o preco
         quantidade
         informe:
         o total da compra

         */
        double preco, total;
        int quantidade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preco do produto");
        preco = scanner.nextDouble();
        System.out.println("Digite a quantidade de produtos vendidos");
        quantidade = scanner.nextInt();

        total = preco * quantidade;

        System.out.println("O total da venda é: " + total);






        }
    }
