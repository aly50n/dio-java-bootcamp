package models;

import java.util.ArrayList;
import java.util.List;

import exceptions.SaldoInsuficienteException;
import intefaces.iConta;
import lombok.Data;
import operations.Pix;
import operations.Transferencia;

@Data
public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static long SEQUENCIAL = 1;

    protected double saldo;
    protected long numeroConta;
    protected Cliente cliente;
    protected List<Transferencia> registroTransferencias;

    public Conta(Cliente cliente) {
        this.saldo = 0d;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.registroTransferencias = new ArrayList<>();
    }

    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.registroTransferencias = new ArrayList<>();
    }

    @Override
    public void depositar(Double valorDeposito) {
        this.saldo += valorDeposito;

    }

    @Override
    public void sacar(Double valorSaque) {
        this.saldo -= valorSaque;

    }

    @Override
    public void transferirPix(Double valorTransferencia, Conta conta) throws SaldoInsuficienteException {

        if (valorTransferencia > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a operação.");
        }
        registroTransferencias.add(new Pix(this, conta, valorTransferencia, "PIX"));

    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", Conta.getAgenciaPadrao()));
        System.out.println(String.format("Numero da conta: %d", this.getNumeroConta()));
        System.out.println(String.format("Saldo da conta: %.2f", this.getSaldo()));
    }

    public static int getAgenciaPadrao() {
        return AGENCIA_PADRAO;
    }

}
