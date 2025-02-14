import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
                /*  Q__u_e_st_ã_o_4_________________________________________________
        Maria amou o programa que você fez para ela de calcular a área dos terrenos, mas ela possui outro
        grande problema: alguns terrenos não possuem lados uniformes, assim, ela precisa, muitas vezes,
                informar, além da área, o perímetro do terreno. Ela confirmou a você que todos os terrenos só
        possuem quatro lados. Você sabe que para calcular o perímetro do terreno basta somar todos os
        lados. Dessa forma, você confirmou a ela que faria esse programa de calcular perímetro.

        deseja: calcular um perimetro com lados desiguais
        criar: um programa
        Leia:
        os quatro lados do terreno


        */

        double lado1, lado2,  lado3, lado4, total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado um");
        lado1 = scanner.nextDouble();
        System.out.println("Digite o tamanho do lado dois");
        lado2 = scanner.nextDouble();
        System.out.println("Digite o tamanho do lado tres");
        lado3 = scanner.nextDouble();
        System.out.println("Digite o tamanho dolado quatro");
        lado4 = scanner.nextDouble();

        total = lado1 + lado2 + lado3 + lado4;

        System.out.printf("O perimetro mede %.2fm ", total);




    }


}
