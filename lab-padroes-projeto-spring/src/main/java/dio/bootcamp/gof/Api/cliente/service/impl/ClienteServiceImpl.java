package dio.bootcamp.gof.Api.cliente.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.bootcamp.gof.Api.cliente.dto.ClienteRequest;
import dio.bootcamp.gof.Api.cliente.dto.ClienteResponse;
import dio.bootcamp.gof.Api.cliente.mapper.ClienteMapper;
import dio.bootcamp.gof.Api.cliente.service.ClienteService;
import dio.bootcamp.gof.Api.cliente.service.ViaCepService;
import dio.bootcamp.gof.core.model.Cliente;
import dio.bootcamp.gof.core.model.Endereco;
import dio.bootcamp.gof.core.repository.ClienteRepository;
import dio.bootcamp.gof.core.repository.EnderecoRepository;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author aly50n
 */
@Service
public class ClienteServiceImpl implements ClienteService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private ClienteRepository clienteRepository;
	
    @Autowired
	private EnderecoRepository enderecoRepository;
	
    @Autowired
	private ViaCepService viaCepService;
	
	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
	@Autowired
    private ClienteMapper clienteMapper;

	@Override
	public List<ClienteResponse> buscarTodos() {
		return clienteRepository.findAll()
								.stream()
								.map(clienteMapper::toResponse)
								.toList();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		return clienteRepository.findByIdOrElseThrow(id);
	}

	@Override
	public void inserir(ClienteRequest clienteRequest) {
		salvarClienteComCep(clienteRequest);
	}

	@Override
	public void atualizar(Long id, ClienteRequest clienteRequest) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComCep(clienteRequest);
		}
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
	}

	private void salvarClienteComCep(ClienteRequest clienteRequest) {
	
		String cep = clienteRequest.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});

		clienteRequest.setEndereco(endereco);
		var clientePraCriar = clienteMapper.toModel(clienteRequest);
		clienteRepository.save(clientePraCriar);
	}
    
}
