public class FiltroNumerosPositivos {
    public static void main(String[] args) throws Exception {
        int numeros [] = {1,-2,3,-4,5,6,-7,-8,9};
        for(int numero : numeros){
            if(numero<0){
                continue;
            }
            System.out.print(numero+" ");
        }
        System.out.println("\nFim!");

    }
}
