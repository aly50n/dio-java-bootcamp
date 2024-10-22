import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream()
                                    .distinct()
                                    .count() == numeros.size();
                                
        if(todosDistintos){
            System.out.println("Todos os números na lista são diferentes.");
        }else{
            System.out.println("Existem números repetidos na lista.");
        }
    }
}
