package dio.bootcamp.gof.facade;

import dio.bootcamp.gof.subsistema1.crm.CrmService;
import dio.bootcamp.gof.subsistema2.cep.CepApi;

public class Facade {
    
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
