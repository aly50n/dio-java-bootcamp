package intefaces;
import exceptions.SaldoInsuficienteException;
import models.Conta;

public interface iConta {

    void sacar(Double valorSaque);

    void depositar(Double valorDeposito);

    void transferirPix(Double valorTransferencia, Conta conta) throws SaldoInsuficienteException;

    void imprimirExtrato();
}
