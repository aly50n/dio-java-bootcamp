import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente alyson = new Cliente();
        alyson.setNome("Alyson");
        Conta contaC = new ContaCorrente(alyson);
        Conta contaP = new ContaPoupanca(alyson);
        contaC.depositar(100.0);
        contaC.imprimirExtrato();
        contaP.imprimirExtrato();
        contaC.transferirPix(100d,contaP);
        contaP.imprimirExtrato();

    }
}
