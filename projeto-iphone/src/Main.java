import telefone.iPhone;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        iPhone meuIPhone = new iPhone();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while(opcao != 0){
            System.out.print("1-Testar reprodutor musical\n2-Testar aparelho telefonico\n3-Testar navegador de internet\n0-Sair\nEscolha uma opção: ");
            opcao= scanner.nextInt();
            scanner.nextLine();
            int auxiliar;
            if(opcao == 1){
                System.out.println("Reprodutor Musical:");
                System.out.print("Selecione uma musica: ");
                meuIPhone.selecionarMusica(scanner.nextLine());
                System.out.print("Deseja pausar a musica? (1-SIM || 2-NÃO) ");
                auxiliar = scanner.nextInt();
                scanner.nextLine();
                if(auxiliar == 1){
                    meuIPhone.pausar();
                }
                System.out.print("Deseja voltar a reproduzir a musica atual? (1-SIM || 2-NÃO) ");
                auxiliar = scanner.nextInt();
                scanner.nextLine();
                if(auxiliar == 1){
                    meuIPhone.tocar();
                }
                
                
            }
            else if(opcao == 2){
                System.out.println("\nAparelho Telefônico:");
                System.out.print("Digite um numero para ligar: ");
                meuIPhone.ligar(scanner.nextLine());
                
                System.out.print("Estão te ligando, atender? (1-SIM || 2-NÃO) ");
                auxiliar = scanner.nextInt();
                scanner.nextLine();
                if(auxiliar == 1){
                    meuIPhone.atender();
                }
                System.out.print("Há uma mensagem no correio de voz, deseja inicia-lo? (1-SIM || 2-NÃO) ");
                auxiliar = scanner.nextInt();
                scanner.nextLine();
                if(auxiliar == 1){
                    meuIPhone.iniciarCorreioVoz();
                }
                
                
            }
            else if(opcao == 3){
                System.out.println("\nNavegador de Internet:");
                System.out.print("Digite uma URL para navegar: ");
                meuIPhone.exibirPagina(scanner.nextLine());

                System.out.print("Deseja adicionar uma nova aba? (1-SIM || 2-NÃO) ");
                auxiliar = scanner.nextInt();
                scanner.nextLine();
                if(auxiliar == 1){
                    meuIPhone.adicionarNovaAba();
                }
                System.out.print("Deseja atualizar a pagina atual? (1-SIM || 2-NÃO) ");
                auxiliar = scanner.nextInt();
                scanner.nextLine();
                if(auxiliar == 1){
                    meuIPhone.atualizarPagina();
                }
                System.out.print("Deseja fechar a aba atual? (1-SIM || 2-NÃO) ");
                auxiliar = scanner.nextInt();
                scanner.nextLine();
                if(auxiliar == 1){
                    meuIPhone.fecharAbaAtual();
                }
                
                
            }
            
        }
        
    }
}
