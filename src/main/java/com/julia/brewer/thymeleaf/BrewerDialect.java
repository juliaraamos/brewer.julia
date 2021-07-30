package com.julia.brewer.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.julia.brewer.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.julia.brewer.thymeleaf.processor.MessageElementTagProcessor;
import com.julia.brewer.thymeleaf.processor.OrderElementTagProcessor;

public class BrewerDialect extends AbstractProcessorDialect{

	public BrewerDialect() {
		super("Júlia Brewer", "brewer", StandardDialect.PROCESSOR_PRECEDENCE);
	}
	
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcessor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		return processadores;
	}

}
