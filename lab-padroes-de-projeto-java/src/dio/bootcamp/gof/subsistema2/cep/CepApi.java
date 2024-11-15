package dio.bootcamp.gof.subsistema2.cep;

public class CepApi {
    
    private static CepApi cepApi = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return cepApi;
    }

    public String recuperarCidade(String cep){
        return "Araraquara";
    }
    
    public String recuperarEstado(String cep){
        return "SP";
    }

}
