package main.java.list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {
    private List<Integer> numeros;

    public SomaDeNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                soma+=numero;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        if(!numeros.isEmpty()){
            int maiorNumero = numeros.get(0);
            for(Integer numero : numeros){
                if(numero>maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }
        return 0;
    }

    public int encontrarMenorNumero(){
        if(!numeros.isEmpty()){
            int menorNumero = numeros.get(0);
            for(Integer numero : numeros){
                if(numero<menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }
        return 0;
    }
    public List<Integer> exibirNumeros(){
        return this.numeros;
    }

    public static void main(String[] args) {
        SomaDeNumeros numerosParaSomar = new SomaDeNumeros();
        numerosParaSomar.adicionarNumero(5);
        numerosParaSomar.adicionarNumero(9);
        numerosParaSomar.adicionarNumero(1);
        numerosParaSomar.adicionarNumero(10);
        System.out.println("Numeros na lista: "+numerosParaSomar.exibirNumeros());
        System.out.println("Soma dos numeros = "+numerosParaSomar.calcularSoma());
        System.out.println("Maior numero: "+numerosParaSomar.encontrarMaiorNumero());
        System.out.println("Menor numero: "+numerosParaSomar.encontrarMenorNumero());
    }

    /*
    exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista. 
*/
}
