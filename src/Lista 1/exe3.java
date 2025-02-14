import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {


        /*Q__u_e_st_ã_o_3_________________________________________________
Maria trabalha para uma construtora no setor de vendas. Constantemente, ela tem que calcular a
área dos terrenos vendidos. Como Maria é sua amiga há muito tempo, você resolveu ajudá-la
criando um programa que lê o comprimento e a largura e imprime a área total do terreno em
metros quadrados.

    Deseja: a area total do terreno
    criar: um programa
    Leia:

        comprimento
        largura
        informe: area total do terreno


         */

        double comprimento, largura, total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do terreno : " );
        comprimento = scanner.nextDouble();
        System.out.println("Digite a largura do terreno: ");
        largura = scanner.nextDouble();

        total = comprimento * largura;

        System.out.printf("A área total do terreno é: %.2fm²", total);







    }

}
