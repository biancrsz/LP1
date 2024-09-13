import java.util.*;

public class LP2{
    private final Map<String, String> contatos = new HashMap<>();

    public void adicionarContato() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();

        if (nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio.");
            return;
        }

        contatos.put(nome, telefone);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void consultarContato() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome a ser consultado: ");
        String nomeConsultado = scanner.nextLine();

        String telefone = contatos.get(nomeConsultado);

        if (telefone != null) {
            System.out.println("O telefone de " + nomeConsultado + " é: " + telefone);
        } else {
            System.out.println("O nome " + nomeConsultado + " não foi encontrado na agenda.");
        }
    }

    public static void main(String[] args) {
        LP2 agenda = new LP2();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Adicionar contato");
            System.out.println("2. Consultar contato");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    agenda.adicionarContato();
                    break;
                case 2:
                    agenda.consultarContato();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}