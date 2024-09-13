import java.util.ArrayList;
import java.util.Scanner;

public class LP1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.print("Insira aqui a quantidade de nomes: ");
        int quantidadeNomes = scanner.nextInt();

        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.print("Insira o nome " + (i + 1) + ": ");
            String nome = scanner.next();
            nomes.add(nome);
        }

        System.out.print("Insira a posição do nome que deseja consultar (a partir de 1): ");
        int posicao = scanner.nextInt();

        if (posicao <= 0 || posicao > quantidadeNomes) {
            System.out.println("Posição inválida! Por favor, insira um número entre 1 e " + quantidadeNomes);
        } else {

            String nomeConsultado = nomes.get(posicao - 1);
            System.out.println("O nome na posição " + posicao + " é: " + nomeConsultado);
        }
    }
}