import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        int somaDosDigitos = numeros.stream()
            .map(String::valueOf) 
            .flatMapToInt(s -> s.chars() 
                .map(Character::getNumericValue)) 
            .sum();

        System.out.println("A soma dos dígitos é: " + somaDosDigitos);
    }
}
