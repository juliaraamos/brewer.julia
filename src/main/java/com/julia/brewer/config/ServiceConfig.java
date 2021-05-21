package com.julia.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.julia.brewer.service.CadastroCervejaService;




@Configuration
@ComponentScan(basePackageClasses = CadastroCervejaService.class)
public class ServiceConfig {

	/*@Autowired
	private Cervejas cervejas;
	
	public void salvar(Cerveja cerveja) {
		cervejas.save(cerveja);
	}*/
	
}
