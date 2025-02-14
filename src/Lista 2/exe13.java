import java.util.Scanner;

public class exe13 {

    public static void main(String... args) {

    /* ________________________________________________________
Você sabe que o “par ou ímpar” é o modo tradicional de escolher algo pela sorte. Normalmente, as
duas pessoas usam apenas uma mão e escolhem o número de dedos que desejam. Você soma o
total de dedos e verifica se o número é ímpar ou par. Um número é par se a sua divisão inteira por
2 resta zero, um número é ímpar no caso contrário. Então, faça isso. Leia o número de dedos da
mão de cada jogador e diga se o resultado deu ímpar ou par.*/


        Scanner scanner = new Scanner(System.in);

        int jogador1, jogador2;

        System.out.println("Quantos dedos o jogador 1 jogou?");
            jogador1 = scanner.nextInt();

        System.out.println("Quantos dedos o jogador 2 jogou? ");
            jogador2 = scanner.nextInt();

            if(jogador1>5)
            {   System.out.println("jogador 1,voce é um mutante?");
            }else if(jogador2>5) {
                System.out.println("jogador 2, voce é um mutante?");
            } else if ((jogador1 + jogador2) % 2 == 0) {
            System.out.println("O resultado é par");
            }else { System.out.println("o resultado é impar");}



    }
}
