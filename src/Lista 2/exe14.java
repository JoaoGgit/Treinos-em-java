import java.util.Scanner;

public class exe14 {

    public static void main(String... args) {

        /* ________________________________________________________
Na sua escola, você faz três avaliações no ano e a sua nota final é a média aritmética dessas três
avaliações. Para você ser aprovado sua média deve ser maior ou igual a 7.0 pontos, caso contrário
você estará reprovado. Faça um programa para ler suas notas e dizer se você está aprovado ou
reprovado.*/

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, notaFinal;

        System.out.println("Digite a nota da sua primeira avaliação: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da sua segunda avaliação: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da sua terceira avaliação: ");
        nota3 = scanner.nextDouble();

        notaFinal = (nota1 + nota2+ nota3) / 3;

        if (notaFinal >= 7.0){
            System.out.printf("Sua nota final é : %.1f e voce está aprovado", notaFinal);
        } else { System.out.printf("Sua nota é: %.1f e voce está reprovado", notaFinal);}

    }
}
