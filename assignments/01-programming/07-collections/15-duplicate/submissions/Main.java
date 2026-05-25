import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EliminarNomesDuplicados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // TreeSet ordena automaticamente os nomes
        Set<String> nomes = new TreeSet<>();

        System.out.println("Digite os nomes (digite 'fim' para encerrar):");

        while (true) {
            System.out.print("> ");
            String nome = scanner.nextLine().trim();

            // Encerra cadastro
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            // Padroniza: primeira letra maiúscula
            nome = formatarNome(nome);

            // Adiciona sem duplicar
            nomes.add(nome);
        }

        System.out.println("\nNomes cadastrados:");
        System.out.println(nomes);

        // Pesquisa
        System.out.println("\nPesquisar nomes (digite 'sair' para encerrar):");

        while (true) {
            System.out.print("> ");
            String busca = scanner.nextLine().trim();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            busca = formatarNome(busca);

            if (nomes.contains(busca)) {
                System.out.println("Nome encontrado.");
            } else {
                System.out.println("Nome não encontrado.");
            }
        }

        scanner.close();
    }

    // Método para padronizar nomes
    public static String formatarNome(String nome) {

        if (nome.isEmpty()) {
            return nome;
        }

        nome = nome.toLowerCase();

        return nome.substring(0, 1).toUpperCase() + nome.substring(1);
    }
}
