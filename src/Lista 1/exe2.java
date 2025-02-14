import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {

        /* Q__u_e_st_ã_o_2_________________________________________________
        Você está começando na academia hoje e a sua instrutora fez um levantamento do seu biotipo,
        além de outras informações suas. Ela para calcular o seu IMC (Índice de Massa Corporal), mediu o
        seu peso e sua altura. Com essas informações em mãos, ela calculou o seu IMC usando a seguinte
        fórmula: imc = peso / (altura * altura). Com o valor calculado, ela te apresentou a sua ficha de
        acompanhamento. Você resolveu ajudar a sua instrutora e vai fazer um programa para calcular o
        imc.

        deseja: calcular o IMC
        Criar: um programa
        Leia:
        peso
        altura
        informe: o resultado do IMC

         */

        double peso, altura, imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        peso = scanner.nextDouble();
        System.out.println("Digite a sua altura: ");
        altura = scanner.nextDouble();

        imc = peso/ (altura*altura);

        System.out.printf("O seu IMC é: %.2f", imc);

    }
}