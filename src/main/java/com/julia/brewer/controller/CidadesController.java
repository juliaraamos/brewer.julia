package com.julia.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.julia.brewer.model.Cidade;


@Controller
public class CidadesController {

	@RequestMapping("/cidades/novo")
	public String novo(Cidade cidade) {
		return ("cidade/CadastroCidade");
	}
	
}
