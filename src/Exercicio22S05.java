import java.util.Scanner;

public class Exercicio22S05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInforme a faixa de consumo(metros cubicos): ");
        int faixaDeConsumo = sc.nextInt();
        int valorMensal = 7;

        sc.close();
        

        if (faixaDeConsumo > 100) {
            valorMensal += (faixaDeConsumo - 100) * 5;
            faixaDeConsumo = 100;
        }

        if (faixaDeConsumo > 30) {
            valorMensal += (faixaDeConsumo - 30) * 2;
            faixaDeConsumo = 30;
        }

        if (faixaDeConsumo > 10) {
            valorMensal += (faixaDeConsumo - 10) * 1;
        }

        System.out.println("valor em reais: " + valorMensal);


        

        


    }
}
