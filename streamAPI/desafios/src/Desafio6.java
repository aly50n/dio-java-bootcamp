import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) throws Exception {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> numerosMaioresQueDez = numeros.stream()
                                                    .filter(n -> n>10)
                                                    .toList();
        
        if(numerosMaioresQueDez.isEmpty())
            System.out.println("A lista não contém numeros maiores que 10.");
        else
            System.out.println("Os numeros contidos na lista maiores que 10 são: "+numerosMaioresQueDez);
        
        
    }

}
