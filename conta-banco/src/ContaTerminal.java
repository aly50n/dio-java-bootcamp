import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        

        System.out.println("Por favor, digite o numero da agência: ");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumindo a linha que ficou no buffer
        System.out.println("Por favor, digite o nome da agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumindo a linha que ficou no buffer
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+ numero +" e seu saldo R$ "+ saldo +" já está disponível para saque!");
        

    }
}
