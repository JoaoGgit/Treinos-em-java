import java.util.Scanner;

public class exe18 {
    public static void main(String... args) {


        Scanner scanner = new Scanner(System.in);

    /* Q__u_e_s_tã_o_8_________________________________________________
Em um jogo de tabuleiro, um jogador pode movimentar uma peça apenas se o número do seu
dado for maior que o do seu adversário. Faça um programa que informe se o jogador pode ou não
jogar aquela partida. Leia o número do dado do jogador e do seu adversário e informe quem deve
jogar. No caso de empate, nenhum dos jogadores joga.
*/


        int jogador, adversario;

        System.out.println("Informe o número do dado do jogador: ");
           jogador = scanner.nextInt();
        System.out.println("Informe o número do dado do adversário: ");
            adversario = scanner.nextInt();

            if (jogador>adversario){
                System.out.println("O jogador obteve um número maior nos dados, portanto deve jogar");
            } else if (jogador<adversario) {
                System.out.println("O adversário obteve um número maior nos dados, portanto deve jogar");
            } else {
                System.out.println("Como empataram, nenhum dos 2 deve jogar");
            }

    }
}
