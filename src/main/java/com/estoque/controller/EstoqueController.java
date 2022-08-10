package com.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estoque.entity.Estoque;
import com.estoque.repository.EstoqueRepository;


@Controller
@RequestMapping("/")
public class EstoqueController {
	
	@Autowired
	private EstoqueRepository repo;

	@GetMapping
	public String index() {
		return "index";
	}

	@GetMapping("/cadastrar")
	public String formCadastro() {
		return "cadastrar";
	}

	@GetMapping("/consultar")
	public String formConsulta(Model model) {
		Iterable<Estoque> listarEstoque = repo.findAll();
		model.addAttribute("estoques", listarEstoque);
		return "consultar";
	}

	@GetMapping("/consultar/{idProduto}")
	public String formEditar(@PathVariable("idProduto") int id, Model model) {
		Estoque estoque = repo.findById(id).get();
		model.addAttribute("estoque", estoque);
		return "editar";
	}

	@GetMapping("/excluir/{idProduto}")
	public String excluir(@PathVariable("idProduto") int id) {
		repo.deleteById(id);
		return "redirect:/consultar";
	}

	@PostMapping("/cadastrar")
	public String salvar(Estoque estoque) {
		repo.save(estoque);
		return "redirect:/consultar";
	}
	
	
	

}
