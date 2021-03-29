package br.edu.infnet.AppATMarcelo_Carlos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppATMarcelo_Carlos.model.negocio.Produto;
import br.edu.infnet.AppATMarcelo_Carlos.model.negocio.Usuario;
import br.edu.infnet.AppATMarcelo_Carlos.model.service.ClienteService;
import br.edu.infnet.AppATMarcelo_Carlos.model.service.ProdutoService;

@Controller
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private ClienteService clienteService;
	
			
	@GetMapping(value = "/produto")
	public String showProduto(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("lista", produtoService.obterLista(usuario));
		model.addAttribute("clientes", clienteService.obterLista());		
		return "produto/detalhe";
	}
	
	
	@PostMapping(value = "/produto/incluir")
	public String incluir(Produto produto, @SessionAttribute("user") Usuario usuario) {
		
		produto.setUsuario(usuario);
		produtoService.incluir(produto);
		
		return "redirect:/produto";
	}
	
	@GetMapping(value = "/produto/id/excluir")
	public String excluir(@PathVariable Integer id) {
		
		produtoService.excluir(id);
		return "redirect:/produto";
		
	}

}
