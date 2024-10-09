import java.util.Scanner;

public class Exercicio40S05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInforme sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Informe seu peso: ");
        double peso = sc.nextDouble();

        double pesoIdeal = 0;

        sc.close();

        if (altura <= 1.50 && peso == 50) {
            System.out.println("Parabéns, peso ideal");

        } else if (altura <= 1.50 && peso != 50) {
            pesoIdeal = 50;
            peso -= pesoIdeal;
            System.out.println("emagreça: " + Math.abs(peso) + " kg");

        } else if (altura >= 1.51 && altura <= 1.90 && peso == 70) {
            System.out.println("Parabéns, peso ideal");

        } else if (altura >= 1.51 && altura <= 1.90 && peso != 70) {
            pesoIdeal = 70;
            peso -= pesoIdeal;
            System.out.println("emagreça: " + Math.abs(peso) + " kg");

        } else if (altura > 1.91 && peso == 100) {
            System.out.println("parabéns, peso ideal");

        } else if (altura > 1.91 && peso != 100) {
            pesoIdeal = 100;
            peso -= pesoIdeal;
            
            System.out.println("emagreça: " + Math.abs(peso) + " kg");
        }
    }
}
