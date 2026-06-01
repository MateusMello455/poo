import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isValidInput(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();

        int inicio = 0;
        int fim = input.length() - 1;

        while (inicio < fim) {
            if (input.charAt(inicio) != input.charAt(fim)) {
                return false;
            }

            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada;

        do {
            System.out.print("Digite uma sequência: ");
            entrada = scanner.nextLine();

            if (!isValidInput(entrada)) {
                System.out.println("Erro: A entrada não pode estar vazia.");
            }

        } while (!isValidInput(entrada));

        if (isPalindrome(entrada)) {
            System.out.println("A sequência \"" + entrada + "\" é um palíndromo.");
        } else {
            System.out.println("A sequência \"" + entrada + "\" não é um palíndromo.");
        }

        scanner.close();
    }
}