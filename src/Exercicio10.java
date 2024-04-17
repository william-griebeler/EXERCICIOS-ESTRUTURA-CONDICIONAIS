import java.util.Scanner;

public class Exercicio10 {

    // Crie um programa que recebe o salário de um funcionário.
    // e verifica se ele está acimado salário mínimo atual.

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Defina o valor do salário mínimo atual
        final double salarioMinimoAtual = 1320.00;

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        if (salarioFuncionario > salarioMinimoAtual) {
            System.out.println("O salário do funcionário está acima do salário mínimo atual.");
        } else if (salarioFuncionario == salarioMinimoAtual) {
            System.out.println("O salário do funcionário é igual ao salário mínimo atual.");
        } else {
            System.out.println("O salário do funcionário está abaixo do salário mínimo atual.");
        }

        scanner.close();
    }
}
