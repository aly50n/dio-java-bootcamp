package intefaces;

import exceptions.SaldoInsuficienteException;
import models.Conta;

public interface iTransferencia {
    
    void realizarTransferencia(Conta origem, Conta destino, double valor) throws SaldoInsuficienteException;
    void detalhesTransferencia(Conta origem, Conta destino, double valor);

}
