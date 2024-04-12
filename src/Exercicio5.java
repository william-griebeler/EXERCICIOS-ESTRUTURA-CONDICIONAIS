import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        // Escreva um programa que recebe três números do usuário.

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro número:");
        double num3 = scanner.nextDouble();
        
        // Encontra o maior entre os três números
        double maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        
        // Imprime o maior número
        System.out.println("O maior número é: " + maior);
        
        scanner.close();

    }
}
