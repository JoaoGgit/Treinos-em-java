import java.util.Scanner;

public class exe5 {
    public static <string> void main(String[] args) {

        /* Q__u_e_st_ã_o_5_________________________________________________
        Você quer viajar para fora do Brasil, mas ainda não escolheu o seu destino. Você está em dúvida
        entre Europa, Canadá, Estados Unidos e Argentina. Você sabe que as moedas nessas regiões são:
        euro, dólar canadense, dólar americano, peso argentino. Você queria um programa que você
        desse o valor que deseja levar e as cotações do dia de cada moeda e imprimisse quanto em cada
        moeda você teria. Então, resolveu que faria esse programa para você e sua mãe verem quanto de
        dinheiro teriam em cada região.

        Deseja: u programa pra ver quanto dinheiro teriam em cada regiao
        Criar: um programa
        Leia:
        Euro
        Dolar canadense
        Dolar
        Pesos Argentinos

         */
        Scanner scanner = new Scanner(System.in);

        double real ,euro, dolarCanadense, dolar, pesosArgentinos;
        System.out.println("Informe o numero de reais que voce possui");
        real =  scanner.nextDouble();
        euro = real/ 6.3015;
        dolarCanadense = real/ 1.43;
        dolar =real/ 5.76;
        pesosArgentinos = real/ 0.005468;

        System.out.printf("O seu saldo convertido nas seguintes localidades é de :%n");
        System.out.printf( "Seu saldo em reais : R$%.2f%n", real);
        System.out.printf( "Seu saldo em euro: €%.2f%n", euro);
        System.out.printf("Seu saldo em dolar canadense: C$%.2f%n", dolarCanadense);
        System.out.printf("Seu saldo em dolar: $%.2f%n", dolar);
        System.out.printf("Seu saldo em pesos argentinos: $%.2f%n ", pesosArgentinos);





    }


}
