import java.util.Scanner;

public class Excercicio7 {

    public static void main(String[] args) throws Exception {

    
    char letra ;
   
    System.out.printf("Informe uma letra: ");
    letra = scanner.next().charAt(0);
 
    //Condição
 
    if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'||
        letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
        System.out.printf("A letra %s, é uma vogal!", letra);
    }
    else{
        System.out.printf("A Letra %s, não é uma vogal!", letra);
    }
 
 
 
      scanner.close();
        
    

    
    