package operations;

import java.time.LocalDateTime;

import intefaces.iTransferencia;
import lombok.Data;
import models.Conta;
import utils.FormatadorTempo;

@Data
public abstract class Transferencia implements iTransferencia {

    LocalDateTime agora;

    private Conta origem;
    private Conta destino;
    private double valor;
    private String tipo; // PIX, TED, DOC, etc.
    private String dataHora;

    public Transferencia(Conta origem, Conta destino, double valor, String tipo) {

        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.tipo = tipo;

        this.dataHora = new FormatadorTempo().formatarData();

        this.detalhesTransferencia(origem, destino, valor);

    }

    public void detalhesTransferencia(Conta origem, Conta destino, double valor) {
        System.out.println("COMPROVANTE DE TRANSFERÊNCIA");
        System.out.println(new FormatadorTempo().formatarData().toUpperCase() + "\n");
        
        System.out.println(String.format("Valor: R$ %.2f", valor) + "\n");
        System.out.println("Tipo de transferência: " + this.getTipo() + "\n");
        
        System.out.println("DESTINO");
        System.out.println("Nome: " + destino.getCliente().getNome());
        System.out.println("CPF: " + destino.getCliente().getCpf() + "\n");
        
        System.out.println("ORIGEM");
        System.out.println("Nome: " + origem.getCliente().getNome());
        System.out.println("Agencia: " + Conta.getAgenciaPadrao());
        System.out.println("Conta: "+ origem.getNumeroConta());
        System.out.println("CPF: " + origem.getCliente().getCpf() + "\n");
    }

    

}
