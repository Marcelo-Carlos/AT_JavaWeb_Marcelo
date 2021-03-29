	package br.edu.infnet.AppATMarcelo_Carlos.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppATMarcelo_Carlos.model.negocio.Produto;
import br.edu.infnet.AppATMarcelo_Carlos.model.negocio.Usuario;
import br.edu.infnet.AppATMarcelo_Carlos.model.repository.IProdutoRepository;


@Service
public class ProdutoService {

	@Autowired
	private IProdutoRepository produtoRepository;
	
	public void incluir(Produto produto) {
		
		produtoRepository.save(produto);		
	}
	
	public void excluir(Integer id) {
		
		produtoRepository.deleteById(id);
		
	}
	
	public List<Produto> obterLista() {
		return (List<Produto>)produtoRepository.findAll();
		
	}
	
	public List<Produto> obterLista(Usuario usuario) {
		return (List<Produto>)produtoRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "produto"));
		
	}



}
