import java.util.Scanner;

public class exe12 {

    public static void main(String... args) {
        /* ________________________________________________________
Você viu na televisão que esse inverno vai ser rigoroso no Brasil. Decidiu então que vai monitorar a
temperatura da sua cidade. Se as temperaturas estiverem abaixo de 17ºC, você vai exibir na tela:
“Frio da moléstia", mas caso contrário: “Tudo normal nas terras de Cuçumarim”*/

        Scanner scanner = new Scanner(System.in);

        double temperatura;

        System.out.println("Digite a temperatura atual de Cuçumarim: ");
        temperatura = scanner.nextDouble();

        if (temperatura <17) {
            System.out.println("Frio da moléstia");
        } else {
            System.out.println("Tudo normal nas terras de Cuçumari");}
        }
    }
