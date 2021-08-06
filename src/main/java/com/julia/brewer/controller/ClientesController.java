package com.julia.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.julia.brewer.model.Cliente;
import com.julia.brewer.model.TipoPessoa;

@Controller
@RequestMapping("/clientes")
public class ClientesController {
	
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cliente/CadastroCliente");
		mv.addObject("tiposPessoa", TipoPessoa.values());	
		return mv;
	}
	
	
}
