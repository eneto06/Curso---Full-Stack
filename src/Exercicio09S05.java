import java.util.Scanner;

public class Exercicio09S05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInforme o tempo de duração do evento na fábrica(em segundos): ");
        int segundos = sc.nextInt();

        int horas = (segundos/3600);
        int minutos = (segundos - (horas * 3600)) / 60;
        segundos = segundos - (horas * 3600) - (minutos * 60);

        sc.close();

        System.out.println(" HH:MM:SS " + horas + ":" + minutos + ":" + segundos);



    }
}