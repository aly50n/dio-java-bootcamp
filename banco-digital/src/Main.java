import models.Banco;
import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente alyson = new Cliente();
        alyson.setNome("Alyson");
        alyson.setCpf("123.456.778-00");

        Cliente roberto = new Cliente();
        roberto.setNome("roberto");
        roberto.setCpf("213.555.687-88");

        Conta contaC = new ContaCorrente(alyson);
        Conta contaP = new ContaPoupanca(roberto);
        contaC.depositar(100d);
        contaC.transferirPix(100d, contaP);

        Banco banco = new Banco("Roxinho");
        banco.adicionarConta(contaP);
        banco.adicionarConta(contaC);
        banco.removerConta(1);
        banco.listarContas();

    }
}
