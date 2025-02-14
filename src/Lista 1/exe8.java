import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {

        /*Q__u_e_st_ã_o_8______________________________________________
O IBGE (Instituto Brasileiro de Geografia e Estatística) para definir um preço médio de um produto
alimentar, por exemplo: o feijão, faz consulta a pelo menos 5 mercados de tamanhos variados.
Após ler os valores dos 5 mercados, o instituto calcula o valor médio do produto. Diferente do que
era praticado antes, atualmente, o IBGE utiliza um pequeno sistema para computar o preço
médio. Você está trabalhando na equipe de TI do IBGE para calcular o preço médio dos produtos.
Lembre-se de ler os cinco preços, calcular a média e exibir o resultado.

    Deseja: calcular o preço médio dos produtos
    leia:
    preco1
    preco2
    preco3
    preco4
    preco5
    media

         */
        Scanner scanner = new Scanner(System.in);

        double preco1, preco2, preco3, preco4, preco5, total;

        System.out.println("Informe o preco do produto no primeiro mercado");
        preco1 = scanner.nextDouble();
        System.out.println("Informe o preco do produto no segundo mercado");
        preco2 = scanner.nextDouble();
        System.out.println("Informe o preco do produto no terceiro mercado");
        preco3 = scanner.nextDouble();
        System.out.println("Informe o preco do produto no quarto mercado");
        preco4 = scanner.nextDouble();
        System.out.println("Informe o preco do produto no quinto mercado");
        preco5 = scanner.nextDouble();

        total = (preco1 + preco2 + preco3 + preco4+ preco5) / 5;

        System.out.printf("A média de precos deste produto dos mercados é de : R$%.2f ", total);


    }
}
