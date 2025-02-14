import java.util.Scanner;
import java.util.Random;

public class exe24 {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);


                Random random = new Random();

                int numeroMaximo, numeroEscolhido, numeroSorteado;

                System.out.println("Digite o número máximo permitido para o sorteio:");
                numeroMaximo = scanner.nextInt();

                numeroSorteado = random.nextInt(numeroMaximo) + 1;
                System.out.println("Agora, escolha um número para apostar:");
                numeroEscolhido = scanner.nextInt();

                if (numeroSorteado == numeroEscolhido) {
                    System.out.println("Incrível! Você acertou o número sorteado!");
                } else {
                    System.out.println("Que pena! O número sorteado foi " + numeroSorteado + ". Tente novamente!");
                }


            }
        }





