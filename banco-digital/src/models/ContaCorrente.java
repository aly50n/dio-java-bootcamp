package models;
public class ContaCorrente extends Conta {
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente(Double saldo, Cliente cliente) {
        super(saldo,cliente);
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("=== EXTRATO - CONTA CORRENTE ===");
        super.imprimirInfosComuns();
        System.out.println("=================================");

    }
}
