import java.util.Scanner;

public class Exercicio19S05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSalário do funcionário; ");
        double salario = sc.nextDouble();
        double aumento = 0;
        double novoSalario = 0;

        sc.close();

        if (salario > 500) {
            aumento = salario * 0.10;
        } else if (salario >= 300 && salario <= 500) {
            aumento = salario * 0.07;
        } else {
            aumento = salario * 0.05;
        }

        novoSalario = salario + aumento;

        System.out.printf("Novo salário: %.2f", novoSalario);
    }

}
