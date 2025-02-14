import java.util.Scanner;

public class exe15 {

    public static void main(String... args) {


    /* Q__u_e_s_tã_o_5_________________________________________________
The Asa’s Club é um clube da cidade e você está trabalhando na portaria dela. As regras para
comprar ingressos para o clube são claramente machistas, mas elas são aplicadas. As mulheres
que chegarem até as 22h não pagam a entrada, mas depois desse horário, elas pagam metade do
valor do ingresso. Os homens que chegarem até as 22h pagam 70% do ingresso, enquanto depois
desse horário pagam o valor integral. Você que não perdeu tempo, fez um programa para a
portaria. Eu fico me perguntando porque tu se mete nessas coisas sem ganhar um centavo, mas
tudo bem*/

        Scanner scanner = new Scanner(System.in);

        String sexo;
        double horario, valor = 100;
        double valorM = valor / 2, valorH = (valor * 70) / 100;

        System.out.println("Olá,seja bem-vindo ao Asa's club, poderia me informar se voce é homem ou mulher? ");
        sexo = scanner.nextLine();
        System.out.println("Horário de chegada: ");
        horario = scanner.nextDouble();

        if (sexo.equalsIgnoreCase("Mulher")) {
            if (horario > 22) {
                System.out.printf("Como chegou após as 22 voce pagará: %.2f ", valorM);
            } else {
                System.out.println("Como chegou no horário limite voce pode entrar de graça");
            }

        }

        if (sexo.equalsIgnoreCase("Homem")){
            if (horario <= 22){
                System.out.printf("Como chegou antes das 22 horas voce pagará:%.2f ", valorH);
            } else {
                System.out.printf("Como voce chegou após as 22 horas voce pagará:%.2f ", valor);
            }
        }
    }
}