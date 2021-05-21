package com.julia.brewer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.julia.brewer.model.Cerveja;
import com.julia.brewer.model.Origem;
import com.julia.brewer.model.Sabor;
import com.julia.brewer.repository.Estilos;
import com.julia.brewer.service.CadastroCervejaService;


@Controller
public class CervejasController {

	//@Autowired
	//private Cervejas cervejas;
	//private static final Logger logger = LoggerFactory.getLogger(CervejasController.class);
	
	@Autowired 
	private Estilos estilos;
	
	@Autowired
	private CadastroCervejaService cadastroCervejaService;
	
	@RequestMapping("/cervejas/novo")
	public ModelAndView novo(Cerveja cerveja) {		
		ModelAndView mv = new ModelAndView("cerveja/CadastroCerveja");
		mv.addObject("sabores", Sabor.values());
		mv.addObject("estilos", estilos.findAll());
		mv.addObject("origens", Origem.values());
		
		return mv;
	}

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
		return novo(cerveja);
		} 
		//salvar no banco de dados...
		
		cadastroCervejaService.salvar(cerveja);	
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		return new ModelAndView("redirect:/cervejas/novo");			
		}
}
	
