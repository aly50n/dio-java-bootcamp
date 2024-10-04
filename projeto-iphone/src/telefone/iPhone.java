package telefone;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    private String musicaAtual;
    private boolean tocando;
    private String numeroLigacao;
    private String paginaAtual;

    public iPhone() {
        this.musicaAtual = "";
        this.tocando = false;
        this.numeroLigacao = "";
        this.paginaAtual = "";
    }

    @Override
    public void tocar() {
        if (!this.musicaAtual.isEmpty()) {
            this.tocando = true;
            System.out.println("Reproduzindo música: " + this.musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar(){
        if(this.tocando){
            this.tocando = false;
            System.out.println("Música pausada.");
        }else{
            System.out.println("Nenhuma musica está tocando no momento.");
        }
    }

    @Override
    public void selecionarMusica(String musica){
        this.musicaAtual = musica;
        this.tocando=true;
        System.out.println("A musica que está tocando agora é: "+ musicaAtual);
    }

    @Override
    public void ligar(String numero){
        this.numeroLigacao = numero;
        System.out.println("Ligando para: "+this.numeroLigacao+"...");
    }

    @Override
    public void atender(){
        if(!this.numeroLigacao.isEmpty()){
            System.out.println("Atendendo a ligação de: " + this.numeroLigacao);
        }else{
            System.out.println("Não está recebendo ligação no momento.");
        }
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        paginaAtual = url;
        System.out.println("Exibindo página: " + this.paginaAtual);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("Atualizando página: " + this.paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta para atualizar.");
        }
    }

    @Override
    public void fecharAbaAtual(){
        System.out.println("Fechando a página atual: "+this.paginaAtual);
        this.paginaAtual = "";
    }
}
