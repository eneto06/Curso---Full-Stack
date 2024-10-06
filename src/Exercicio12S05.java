import java.util.Scanner;

public class Exercicio12S05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\ninforme o tipo do animal (vertebrado ou invertebrado): ");
        String input01 = sc.nextLine().trim().toLowerCase();

        System.out.println("ave, mamifero, inseto ou anelídeo: ");
        String input02 = sc.nextLine().trim().toLowerCase();

        System.out.println("carnivoro, onivoro, herbivoro ou hematofago: ");
        String input03 = sc.nextLine().trim().toLowerCase();

        

        if (input01.equals("vertebrado")) {

            if (input02.equals("ave")) {
                if (input03.equals("carnivoro")) {
                    System.out.println("águia");
                } else if (input03.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (input02.equals("mamifero")) {
                if (input03.equals("onivoro")) {
                    System.out.println("homem");
                } else if (input03.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }

        } else {

            if (input01.equals("invertebrado")) {

                if (input02.equals("inseto")) {
                    if (input03.equals("hematofago")) {
                        System.out.println("pulga");
                    } else if (input03.equals("herbivoro")) {
                        System.out.println("lagarta");
                    }

                } else if (input02.equals("anelideo")) {
                    if (input03.equals("hematofago")) {
                        System.out.println("sanguessuga");
                    } else if (input03.equals("onivoro")) {
                        System.out.println("minhoca");
                    }
                }
            }
        }
        
        sc.close();

    }
}
