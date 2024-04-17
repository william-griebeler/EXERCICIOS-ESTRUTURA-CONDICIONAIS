import java.util.Scanner;

public class Exercicio9 {

    //Faça um programa que recebe a altura.
    // e o sexo (M/F) de uma pessoa
    // e verifica se ela está dentro dos padrões de altura considerados normais para o sexo informado homens.
    // com altura entre 160 e 190 cm,
    // mulheres entre 150 e 180 cm).

    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a altura (em cm): ");
    double altura = scanner.nextDouble();

    System.out.print("Digite o sexo (M/F): ");
    char sexo = scanner.next().charAt(0);

    if (sexo == 'M' || sexo == 'm') {
        if (altura >= 160 && altura <= 190) {
            System.out.println("Altura dentro dos padrões normais para homens.");
        } else {
            System.out.println("Altura fora dos padrões normais para homens.");
        }
    } else if (sexo == 'F' || sexo == 'f') {
        if (altura >= 150 && altura <= 180) {
            System.out.println("Altura dentro dos padrões normais para mulheres.");
        } else {
            System.out.println("Altura fora dos padrões normais para mulheres.");
        }
    } else {
        System.out.println("Sexo inválido. Por favor, digite M ou F.");
    }

    scanner.close();
}
}
