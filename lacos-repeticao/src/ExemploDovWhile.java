import java.util.Random;

public class ExemploDovWhile {
    public static void main(String[] args) {
        System.out.println("DISCANDO...");
        do{
            System.out.println("Telefone Tocando");
        }while(tocando());
        System.out.println("Alô !!!");
    }


    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? "+ atendeu);
        //negando o ato de continuar tocando
        return !atendeu;
    }
}
