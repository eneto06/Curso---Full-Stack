import java.util.Scanner;

public class Exercicio26S05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();

        int nBrinquedosLiberados = 0;


        sc.close();

        if (altura >= 1.4 && idade >= 12) {
            
            if (altura >= 1.5 && idade >= 12) {
                nBrinquedosLiberados++;
            }
    
            if (altura >= 1.4 && idade >= 14 ) {
                nBrinquedosLiberados++;
            }
    
            if (altura >= 1.7 || idade >= 16) {
                nBrinquedosLiberados++;
            }

        } else {
            System.out.println("não é permitido brincar no parque devido as limitações de idade e altura");
        }


        

        System.out.println("Número de brinquedos que ele(a) pode andar no parque é: " + nBrinquedosLiberados);
        
    }
}
