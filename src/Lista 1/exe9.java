import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {

       /* Q__u_e_st_ã_o_9______________________________________________
        A sua professora de Física passou uma questão sobre velocidade média. Ela explicou que a
        velocidade média de um corpo, por exemplo, um carro, é calculada dividindo a distância
        percorrido (em metros) pela quantidade de tempo (em segundos).
        Desse modo, a velocidade = distancia / tempo. Você que não é besta foi logo fazendo um
        programa que calculasse a velocidade média, apenas lendo a distância percorrida e o tempo
        gastado para percorrê-lo.

        Deseja: um programa que calculasse a velocidade média, apenas lendo a distância percorrida e o tempo
        gastado para percorrê-lo.
        Leia:
        distancia
        tempo
        velocidadeMedia

        */

        Scanner scanner = new Scanner(System.in);

        double distancia, velocidadeMedia;
        int tempo;

        System.out.println("Informe a distancia percorrida : ");
        distancia = scanner.nextDouble();

        System.out.println("Informe o tempo gasto para percorrê-la: ");
        tempo = scanner.nextInt();

        velocidadeMedia = distancia / tempo;

        System.out.printf("A velocidade média é de:   vm%.2f", velocidadeMedia);

    }
}
