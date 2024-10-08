import java.util.Scanner;

public class Exercicio20S05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String santaAna = "S";
        String industriarios = "I";
        String tabatinga = "T";
        double valorAPagar = 0;

        System.out.println("\nInforme o bairro a ser pesquisado o valor de desconto (S, I ou T): ");
        String bairro = sc.nextLine();

        System.out.println("Informe a renda da familia: ");
        double renda = sc.nextDouble();

        System.out.println("Informe o gasto energético da familia (em R$): ");
        double consumoEnergia = sc.nextDouble();

        if (bairro.equals(santaAna)) {

            if (renda < 0 || consumoEnergia < 0) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            } else if (renda >= 50 && renda <= 500) {
                valorAPagar = consumoEnergia - 25;
            } else if (renda <= 1000) {
                valorAPagar = consumoEnergia - 50;
            }
        } else if (bairro.equals(industriarios)) {

            if (renda < 0 || consumoEnergia < 0 ) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            } else if (renda >= 240 && renda <= 1000) {
                valorAPagar = consumoEnergia - 240;
            } else if (renda <= 5000) {
                valorAPagar = consumoEnergia - 120;
            }
        } else if (bairro.equals(tabatinga)) {
            
            if (renda < 0 && consumoEnergia < 0) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
            } else if (renda >= 5000 && renda <= 10000) {
                valorAPagar = consumoEnergia - 720;
            } else if (renda <= 20000) {
                valorAPagar = consumoEnergia - 360;
            }
        } else {
            System.out.println("BAIRRO INVALIDO");
        }

        System.out.printf("Valor a pagar: R$ %.2f", valorAPagar);



        
    }
}
