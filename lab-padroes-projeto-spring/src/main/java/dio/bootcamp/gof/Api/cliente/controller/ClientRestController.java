package dio.bootcamp.gof.Api.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.bootcamp.gof.Api.cliente.dto.ClienteRequest;
import dio.bootcamp.gof.Api.cliente.dto.ClienteResponse;
import dio.bootcamp.gof.Api.cliente.service.ClienteService;
import dio.bootcamp.gof.core.model.Cliente;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Esse {@link RestController} representa nossa <b>Facade</b>, pois abstrai toda
 * a complexidade de integrações (Banco de Dados H2 e API do ViaCEP) em uma
 * interface simples e coesa (API REST).
 * 
 * @author aly50n
 */


@RestController
@RequestMapping("clientes")
public class ClientRestController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping
    public ResponseEntity<List<ClienteResponse>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<ClienteRequest> inserir(@RequestBody ClienteRequest cliente) {
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ClienteRequest> atualizar(@PathVariable Long id, @RequestBody ClienteRequest cliente) {
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deletar(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
