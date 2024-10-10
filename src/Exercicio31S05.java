import java.util.Scanner;

public class Exercicio31S05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double soma = 0;
        double media = 0;
        int contador = 0;



        while (true) {
            System.out.println("\ninforme a nota do aluno: ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("NOTA INVÁLIDA!");
            } else {
                soma += nota;   
                contador++;  
            }

            if (contador == 2) {
                media = soma / contador;

                System.out.println("MÉDIA = " + media);

                break;
            }

            sc.close();

            
            
           
        }

            

            

        
    }

}
