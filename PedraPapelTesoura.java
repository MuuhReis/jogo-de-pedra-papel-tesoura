import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nBem-vindo a nossa brincadeira!");
        System.out.println("Vamos jogar Pedra, Papel e Tesoura.");
        System.out.println("Será que consegue me vencer?\n");

        String menu = """
                \n*******************
                1 - Pedra 🗿
                2 - Papel 📃
                3 - Tesoura ✂️
                4 - Parar de jogar
                *******************
                """;

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(menu);
            System.out.print("Escolha sua opção: ");
            opcao = input.nextInt();

           switch (opcao) {
                case 1:
                    System.out.println("Pedra");
                    break;
                case 2:
                    System.out.println("Papel");
                    break;
                case 3:
                    System.out.println("Tesoura");
                    break;
                default:
                    break;
            }
            
            int nA = (int) (Math.random() * 3) + 1;

            switch (nA) {
                case 1:
                    System.out.println("Pedra\n");
                     break;
                case 2:
                    System.out.println("Papel\n");
                    break;
                default:
                    System.out.println("Tesoura\n");
                    break;
            }

            if (opcao == nA) {
                System.out.println("Empatamos, vamos tentar novamente!");
            } else if ((opcao == 1 && nA == 3) || (opcao == 2 && nA == 1) || (opcao == 3 && nA == 2)) {
                System.out.println("Você ganhou, Parabéns!");
            } else {
                System.out.println("Eu ganhei! ebaa");
            }

        }

        input.close();
    }
}
