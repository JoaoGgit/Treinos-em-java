import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {

    /*Q__u_e_st_ã_o_7_________________________________________________
        Você saiu com seus amigos para ir ao cinema. Depois de assistirem o filme, vocês foram para um
        restaurante comemorar o aniversário de sua amiga, Alice. Na hora de pagar a conta, como sempre,
                foi aquele furdunço, divide daqui, divide dali. Então, você pensou: vou fazer um programa para
        calcular a conta por pessoa em um aniversário. Claro que a aniversariante não conta. Deste modo,
        você faria um programa que lesse o total da conta, divide-a pelo número de pessoas na mesa,
        menos o aniversariante. Depois, você só precisa exibir quanto cada um tem que pagar.

        deseja: fazer um programa para
        calcular a conta por pessoa em um aniversário
        criar: um programa
        Leia:

        pessoas
        total
        totalfinal
     */
        Scanner scanner = new Scanner(System.in);

        double total, totalfinal;

        System.out.println("Informe o número de pessoas na mesa: ");
        int pessoa = scanner.nextInt();

        System.out.println("Informe o total da conta: ");
        total = scanner.nextDouble();

        totalfinal =  total /(pessoa - 1) ;

        System.out.printf("O valor para cada um na mesa fica: R$%.2f", totalfinal);





    }
}
