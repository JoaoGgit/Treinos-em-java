import java.util.Scanner;

public class exe6 {
    public static <string> void main(String[] args) {

        /* Q__u_e_st_ã_o_6_________________________________________________
O Bar do Boca é um bar conhecido na sua cidade. Todas as sextas-feiras, o bar tem música ao vivo
e um novo cardápio a cada mês. O dono do bar, Boca, não sabe mais o que fazer com as contas
que são fechadas erradas, pois os garçons esquecem de adicionar a taxa de couvert ou esquecem
que a gorjeta sai de 10% para 20%. Você que conhece o Boca há muito tempo resolveu ajudá-lo.
Você vai fazer um programa que ler o total da conta e acrescenta 20% da gorjeta e a taxa fixa do
couvert

    Deseja: programa que ler o total da conta e acrescenta 20% da gorjeta e a taxa fixa do couvert
    criar: um programa
    Leia:
    total da conta
    20% da gorjeta
    taxa fixa do couvert

         */

        Scanner scanner = new Scanner(System.in);

        double gorjeta, couvert, total, totalfinal;

        System.out.println("Informe o número de pessoas na mesa: ");
        int pessoa = scanner.nextInt();

        System.out.println("Informe o valor total da conta: ");
        total = scanner.nextDouble();

        gorjeta = total * 20 /100;
        couvert = pessoa * 20;
        totalfinal = total + gorjeta + couvert;

        System.out.printf("O valor total da conta será de  : R$%.2f", totalfinal );






    }
}