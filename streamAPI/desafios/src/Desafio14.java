/*Desafio 14 - Encontre o maior número primo da lista:
* Com a Stream API, encontre o maior número primo da lista 
* e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> optionalPrimo = numeros.stream()
                                                        .filter(n -> {
                                                            if (n <= 1) return false;
                                                            for (int i = 2; i <= Math.sqrt(n); i++) {
                                                                if (n % i == 0) {
                                                                    return false;
                                                                }
                                                            }
                                                            return true;
                                                        })
                                                        .max(Integer::compare);
        
        System.out.println("Maior numero primo: " + optionalPrimo.orElse(0));
    }
}
