public class ContarNumeros {
    public static void main(String[] args) {
        int contador = 0;
        
        //Usando break.
        /*while (true) {
            System.out.print(contador+" ");
            if(contador == 10){
                break;
            }
            contador++;
            
        }*/
        
        //Usando condição do while
        while (contador<10) {
            System.out.print(contador+" ");
            contador++;
        }

        System.out.println("\nValor final contador: "+contador);
    }
}
