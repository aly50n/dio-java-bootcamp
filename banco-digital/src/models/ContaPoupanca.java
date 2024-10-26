package models;
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca(Double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("=== EXTRATO - CONTA POUPANÇA ===");
        super.imprimirInfosComuns();
        System.out.println("=================================");

    }

}
