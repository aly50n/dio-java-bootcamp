import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 25;
        System.out.println("Seu saldo atual é de: R$ "+saldo+"\nDigite um valor para sacar: ");
        double valorSolicitado = scanner.nextDouble();
        scanner.nextLine(); //limpa buffer

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println("Saque feito com sucesso!\nSaldo após o saque: "+ saldo);
        }
        else{
            System.out.println("O valor solicitado é maior que o seu saldo.");
            System.out.println("Saldo atual: "+ saldo);
        }

    }
}
