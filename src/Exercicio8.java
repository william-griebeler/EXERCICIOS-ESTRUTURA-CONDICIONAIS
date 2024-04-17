import java.util.Scanner;

public class Exercicio8 {
    //Desenvolva um programa que pede ao usuário para digitar um ano.
    // e verifica se é bissexto ou não. 
    //Um ano é bissexto se for divisível por 4, mas não por 100, a menos que também seja divisível por 400.

    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("digite um ano:");
    int ano = scanner.nextInt();

    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
        System.out.println(ano + " é um ano bissexto.");
    } else {
        System.out.println(ano + " não é um ano bissexto.");
    }

    scanner.close();
}


}
