	package br.edu.infnet.AppATMarcelo_Carlos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppATMarcelo_Carlos.model.negocio.Cliente;
import br.edu.infnet.AppATMarcelo_Carlos.model.service.ClienteService;


@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/cliente")
	public String showCliente(Model model) {
		
		model.addAttribute("lista", clienteService.obterLista());		
		return "cliente/detalhe";
	}
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente) {
		
		clienteService.incluir(cliente);
		return "redirect:/cliente";
	}
	
	
	@GetMapping(value = "/cliente/id/excluir")
	public String excluir(Model model, @PathVariable int id) {
		
		try {
			clienteService.excluir(id);			
		} catch (Exception e) {
			model.addAttribute("msg", "Não foi possivel excluir o cliente: " + e.getMessage()	);
			return showCliente(model);
		}
		
		return "redirect:/cliente";
		
	}
}
