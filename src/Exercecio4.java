import java.util.Scanner;

public class Exercecio4 {
    public static void main(String[] args) throws Exception {

    //Desenvolva um programa que verifica se um número é divisível por 7.


    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero %7 == 0) {
            System.out.println(numero + " é divisível por 7.");
        } else {
            System.out.println(numero + " não é divisível por 7.");
        }
        
        scanner.close();



    }
}
