import java.util.Scanner;

public class exe25 {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        /*Q__u_e_s_tã_o_1_5________________________________________________
As cores no computador podem ser representadas por número inteiros entre 0 e 255, ou seja, 256
valores distintos, onde 0 (zero) representa preto e 255 representa branco. Nessa escala de cinza,
os valores abaixo de 128 são os mais escuros, acima desse valor os mais claros. Faça um programa
que leia o nível de cinza, verifique se o valor está entre 0 e 255 e depois diga se é tom escuro ou
claro*/

        int nivelCinza;


        System.out.println("Digite o nível de cinza: ");
        nivelCinza = scanner.nextInt();

        if (nivelCinza == 0) {
            System.out.printf("A cor será preta!\nNúmero da cor: %d.\n", nivelCinza);
        } else if (nivelCinza == 255) {
            System.out.printf("A cor será branca!\nNúmero da cor: %d.\n", nivelCinza);
        } else if (nivelCinza < 128 && nivelCinza > 0) {
            System.out.printf("O tom do cinza será escuro!\nNúmero da cor: %d.\n", nivelCinza);
        } else if (nivelCinza > 128 && nivelCinza < 256) {
            System.out.printf("O tom do cinza será claro!\nNúmero da cor: %d.\n", nivelCinza);
        } else if (nivelCinza == 128) {
            System.out.printf("A cor será cinza!\nNúmero da cor: %d.\n", nivelCinza);
        } else {
            System.out.println("Cores distintas!");
        }

    }
}
