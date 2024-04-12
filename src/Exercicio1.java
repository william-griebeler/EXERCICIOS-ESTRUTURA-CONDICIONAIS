import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        

    Scanner scanner = new Scanner(System.in);

    System.out.println("informe o ano de nacimento:");

    int anoNacimento = scanner.nextInt();

    scanner.close();

    int anoAtual = LocalDate.now().getYear();
    int idade =anoAtual -anoNacimento;

    if (idade>=18) {
        System.out.println("voce e maior de idade");
 
    } else { 
        System.out.println("voce e menor de idade");

    }
    
}


}
