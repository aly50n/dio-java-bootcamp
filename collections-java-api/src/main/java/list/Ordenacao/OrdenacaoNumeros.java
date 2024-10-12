package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros(){
        this.listaNumeros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        this.listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(listaAscendente);
        }
        return listaAscendente;
    }

    public List<Integer> ordernarDescendente(){
        List<Integer> listaDescendente = new ArrayList<>(listaNumeros);
        if(!listaNumeros.isEmpty()){
            Collections.sort(listaDescendente, Comparator.reverseOrder());
        }
        return listaDescendente;
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(12);
        ordenacaoNumeros.adicionarNumero(-1);
        ordenacaoNumeros.adicionarNumero(11);
        System.out.println("Lista Numeros:"+ ordenacaoNumeros.getListaNumeros());
        System.out.println("Lista Ascendente: "+ordenacaoNumeros.ordenarAscendente());
        System.out.println("Lista Descendente: "+ordenacaoNumeros.ordernarDescendente());
    }
    

}
