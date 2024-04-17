import java.util.Scanner;

public class Exercicio7 {   
    
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if (Character.isLetter(caractere)) { // Verifica se é uma letra
            caractere = Character.toLowerCase(caractere); // Converte para minúsculo para facilitar a comparação
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                System.out.println(caractere + " é uma vogal.");
            } else {
                System.out.println(caractere + " é uma consoante.");
            }
        } else {
            System.out.println("Por favor, insira apenas uma letra do alfabeto.");
        }

        scanner.close();
    }
}
   


        
    

    
    