package br.edu.infnet.AppATMarcelo_Carlos.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppATMarcelo_Carlos.model.negocio.Cliente;
import br.edu.infnet.AppATMarcelo_Carlos.model.repository.IClienteRepository;


@Service
public class ClienteService {
	
	@Autowired
	private IClienteRepository clienteRepository;
	
	public void incluir(Cliente cliente) {
		
		clienteRepository.save(cliente);
	}
	
	public void excluir(Integer id) {
		
		clienteRepository.deleteById(id);		
	}
	
	public List<Cliente> obterLista() {
		return (List<Cliente>)clienteRepository.findAll();
		
	}
	

}