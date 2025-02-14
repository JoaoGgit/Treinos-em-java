import java.util.Scanner;

public class exe21 {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        /* Faça um programa que diga se um ano é bissexto ou nao */


        int ano;

        System.out.println("Digite um ano :");
           ano = scanner.nextInt();

            if (ano % 4==0 && ano %100 !=0 || ano % 400 ==0 ){
                System.out.printf("O ano de %d é bissexto", ano);
            }else {
                System.out.printf("%d nao é um ano bissexto", ano);
            }
    }
}
