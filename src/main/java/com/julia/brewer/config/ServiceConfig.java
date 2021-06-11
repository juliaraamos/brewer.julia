package com.julia.brewer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.julia.brewer.service.CadastroCervejaService;
import com.julia.brewer.storage.FotoStorage;
import com.julia.brewer.storage.local.FotoStorageLocal;




@Configuration
@ComponentScan(basePackageClasses = CadastroCervejaService.class)
public class ServiceConfig {

	@Bean
	public FotoStorage fotoStorage() {
		return new FotoStorageLocal();
	}
	
}
