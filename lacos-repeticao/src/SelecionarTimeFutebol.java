import java.util.ArrayList;

public class SelecionarTimeFutebol {
    public static void main(String[] args) {
        int[] camisas  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        ArrayList<Integer> jogadoresSelecionados = new ArrayList<>();
        for(int i=0; i < camisas.length; i++){
            if(jogadoresSelecionados.size() >= 11){
                break;
            }
            jogadoresSelecionados.add(i+1);
        }
        System.out.println(jogadoresSelecionados);
    }
}
