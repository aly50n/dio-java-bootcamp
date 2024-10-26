package operations;

import exceptions.SaldoInsuficienteException;
import models.Conta;

public class Pix extends Transferencia{
    
    public Pix(Conta origem, Conta destino, double valor, String tipo) throws SaldoInsuficienteException{
        super(origem, destino, valor, "PIX");
        this.realizarTransferencia(origem, destino, valor);
    }
    

    @Override
    public void realizarTransferencia(Conta origem, Conta destino, double valor) throws SaldoInsuficienteException {
        if (origem.getSaldo() >= valor) {
            origem.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência Pix realizada com sucesso.");
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para transferência Pix.");
        }
    }
    
}
