package com.julia.brewer.repository.helper.cerveja;

import java.util.List;

import com.julia.brewer.model.Cerveja;
import com.julia.brewer.repository.filter.CervejaFilter;

public interface CervejasQueries {

	public List<Cerveja> filtrar(CervejaFilter filtro);
	
}
