import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite uma temperatura em Celsius: ");
    
    double celsius = scanner.nextDouble(); 
    double fahrenheit = 32 + (celsius * 9 / 5); 
    System.out.println("Valor da temperatura em Fahrenheit: " + fahrenheit);
    final double zero = -273.15;

    if (celsius <= zero){
        System.out.println("alerta");
        
    }
    scanner.close();






    


    }
}
