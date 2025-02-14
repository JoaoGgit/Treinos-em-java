import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {

        /* Q__u_e_st_ã_o_1_0_____________________________________________
Uma loja de tintas deseja informar para os clientes o melhor custo-benefício na compra de suas
tintas. Você foi contratado para desenvolver um programa que deverá pedir o tamanho em
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6
metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
galões de 3,6 litros, que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem
compradas e os respectivos preços em 3 situações:
a. comprar apenas latas de 18 litros;
b. comprar apenas galões de 3,6 litros;
c. misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10%
de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

 deseja: um programa que deverá pedir o tamanho em
metros quadrados da área a ser pintada
    Leia:
        area a ser pintada
        litros de tinta
        diferentes galoes

         */
        Scanner scanner = new Scanner(System.in);

        double  necessario, precoLata, precoGallon, falta, precoM;
        int lata, gallon, misturaL, misturaG;

        System.out.println("A área em metros quadrados da parede é de :");
        double area = scanner.nextDouble();

        necessario = area / 6;

        lata = (int) Math.ceil(necessario / 18);
        precoLata = lata * 80;
        gallon = (int) Math.ceil(necessario / 3.6);
        precoGallon = gallon * 25;
        misturaL = (int) (necessario / 18);
        falta = necessario - (misturaL * 18);
        misturaG = (int) Math.ceil(falta / 3.6);
        precoM = (misturaL * 80) + (misturaG * 25);

        System.out.println("Questao A. Adqurindo somente latas de 18L a quantidade de tinta será:  " + lata + "latas e o preco : R$" + precoLata);
        System.out.println("Questao B. Adquirindo somente galoes de 3,6L a quantidade de tinta será: " + gallon + "galoes e o preco : R$" + precoGallon);
        System.out.println("Questao C. Adquirindo a mistura para conseguir o melhor preco teremos: " + misturaL + " latas e " + misturaG + "galoes e o preco R$" + precoM);

    }}