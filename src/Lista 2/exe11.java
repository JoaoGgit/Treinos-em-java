import java.util.Scanner;

public class exe11 {

    public static void main (String ... args) {

        /* ___Questao 1______________________________________________
Sofia tem oitos anos e está aprendendo os números, os antecessores e os sucessores. Você
resolveu fazer um programa para ajudá-la a saber se um número é sucessor de outro. Você
basicamente pede como entrada um número, depois o suposto sucessor, por fim exibe se o
suposto sucessor é o sucessor mesmo. É tipo assim: Sofia insere os números: 23 e, depois, 24 e
você vai exibir: “O número 24 é sucessor de 23”, mas se Sofia colocar 23 e, depois, 26, você deve
exibir: “O número 26 não é sucessor de 23”. */

        Scanner scanner = new Scanner(System.in);

        int number1, number2;

        System.out.println("Digite um número");
        number1 = scanner.nextInt();

        System.out.println("Digite outro número:");
        number2 = scanner.nextInt();

        if (number2 == (number1 + 1)) {
            System.out.println("O número " + number2 + " é sucessor do número " + number1);
        } else if (number2 == number1 - 1) {
            System.out.println("O número " + number2 + " é antecessor do número " + number1);
        } else {
            System.out.println("O número " + number2 + " nao é sucessor nem antecessor do número " + number1);
        }

    }
    }

