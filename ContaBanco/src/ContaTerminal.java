import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Todo: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Agora, digite o número da Conta:");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Qual é o seu nome?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o saldo da conta:");
        double saldo = Double.parseDouble(scanner.nextLine());

        // Obter Scanner com os valores digitados
        System.out.println("Olá " + nomeCliente + ".\nObrigado por criar uma conta em nosso banco.\nSua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$ " + saldo + " e já está disponível para saque.");

        // Exibir a mensagem conta criada
        scanner.close();
    }
}
