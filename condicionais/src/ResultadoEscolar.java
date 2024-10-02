public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        /*if(nota >= 7){
            System.out.println("Aprovado");
        }
        else if(nota >=5 && nota<7){
            System.out.println("Apto para recuperação");
        }
        else{
            System.out.println("Reprovado");
        }*/
        
        // Condição ternária
        String resultado = nota>=7 ? "Aprovado" : nota>=5 && nota<7 ? "Apto para a recuperação":"Reprovado";
        System.out.println(resultado);
    }
}
