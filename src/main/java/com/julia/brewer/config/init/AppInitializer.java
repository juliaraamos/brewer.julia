package com.julia.brewer.config.init;

import javax.servlet.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


import com.julia.brewer.config.WebConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class<?>[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
	//esse metodo diz o padrão da url que sera delegado, se vc coloca / sera qq url dentro da aplicação
	//o dispatcherservlet precisa achar onde estao os controles. precisa configurar pra ele saber achar os nossos controles. e ele vai fazer isso no que eu retornar na classe acima, servletConfigClasses, pq ela vai rertornar uma conf ensinando o spring a achar os nossos controllers 	
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		
		return new Filter[] { characterEncodingFilter };
	}
}
