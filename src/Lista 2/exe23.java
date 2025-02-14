import java.util.Scanner;

public class exe23 {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        int dia, mes;

        System.out.println("Digite o dia: ");
        dia = scanner.nextInt();
        System.out.println("Digite o mês: ");
        mes = scanner.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Data inválida! O mês deve estar entre 1 e 12.");
        } else if (dia < 1 || dia > 31) {
            System.out.println("Data inválida! O dia deve estar entre 1 e 31.");
        } else if (dia >= 22 && mes == 9 || mes == 10 || mes == 11 || mes == 12 && dia <= 21) {
            System.out.printf("A data %d/%d está na primavera!%n", dia, mes);
        } else if (dia >= 20 && mes == 3 || mes == 4 || mes == 5 || mes == 6 && dia <= 21) {
            System.out.printf("A data %d/%d está no outono!%n", dia, mes);
        } else {
            System.out.printf("A data %d/%d está em outra estação!%n", dia, mes);
        }

    }
}
