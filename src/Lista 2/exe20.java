import java.util.Scanner;

public class exe20 {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        /*Q__u_e_s_tã_o_1_0________________________________________________
A minha sobrinha está aprendendo as letras do alfabeto. Ela ainda confunde o que é vogal e
consoante. Você topou fazer comigo um programa que verifica se uma letra é vogal ou consoante.
Então, é isso, né? Vamos lá?*/

        char letra;

        System.out.printf("Digite uma letra :");
            letra = scanner.next().toUpperCase().charAt(0);

            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O'|| letra == 'U' ) {
                System.out.printf("%c é uma vogal \n", letra);
            }else if (Character.isLetter(letra)) {
                System.out.printf("%c é uma consoante!\n", letra);

            }else {
                System.out.printf("%c não é uma letra do alfabeto!\n", letra);
            }


    }
}
