import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação dos dados via terminal
        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        saldo = scanner.nextDouble();

        // Exibição da mensagem final usando concatenação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                .concat("sua agência é ").concat(agencia)
                .concat(", conta ").concat(String.valueOf(numero))
                .concat(" e seu saldo R$ ").concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        scanner.close();
    }
}
