import java.util.Scanner;

public class exe19 {

    public static void main(String... args) {


        Scanner scanner = new Scanner(System.in);

    /* Q__u_e_s_tã_o_9_________________________________________________
Um baralho contém 52 cartas de 4 tipos (naipes) diferentes: paus, espadas, copas e ouro. Em cada
naipe, que consiste de 13 cartas, 3 dessas cartas contêm as figuras do rei, da dama e do valete,
respectivamente. Faça um programa que leia um número de 1 a 13 e informe qual carta o número
representa por extenso. Lembrando que temos algumas cartas especiais: 1 (Ás), 11 (Valete), 12
(Rainha), 13 (Rei).
*/

        System.out.println("Digite um número de 1 a 13: ");
        int numeroCarta = scanner.nextInt();
        if (numeroCarta < 1 || numeroCarta > 13) {
            System.out.print("Numero invalido!");
        } else {
            if (numeroCarta == 1) {
                System.out.print("O numero um corresponde a carta Ás");
            } else if (numeroCarta == 11) {
                System.out.print("O numero onze corresponde a carta Valete");
            } else if (numeroCarta == 12) {
                System.out.print("O numero doze corresponde a carta Rainha");
            } else if (numeroCarta == 13) {
                System.out.print("O numero treze corresponde a carta Rei");
            } else {
                System.out.printf("O número escolhido foi %d", numeroCarta);
            }
        }

    }
}
