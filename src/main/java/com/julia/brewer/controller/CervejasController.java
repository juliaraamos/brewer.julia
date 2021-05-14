package com.julia.brewer.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.julia.brewer.model.Cerveja;


@Controller
public class CervejasController {

	// preciso ter um método aqui que devolva o nome da view, e ele tb precisa ter
	// mapeado a url

	// qnd digitar no browser cervejas/novo é p retornar cerveja/cadastroCerveja e
	// renderizar o html dizendo "ola..."
	
	private static final Logger logger = LoggerFactory.getLogger(CervejasController.class);
	
	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {		
		return "cerveja/CadastroCerveja";
		// dentro de templates ja fizemos na configuração mas dentro de cerveja/ temos q
		// incluir/retronar aq
		// n colocamos a extensão html no controller pq se um dia precisarmos mudar as
		// configurações n precisara alterar o controller
	}

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
		//mensagem se referindo ao atributo no html e "erro no formulário" vai ser o valor que tá escrito
		return novo(cerveja);
		}		
				//salvar no banco...
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		System.out.println(">>> sku: " + cerveja.getSku());
		System.out.println(">>> nome: " + cerveja.getNome());
		System.out.println(">>> descrição: " + cerveja.getDescricao());
		return "redirect:/cervejas/novo";			
		}
}
	
