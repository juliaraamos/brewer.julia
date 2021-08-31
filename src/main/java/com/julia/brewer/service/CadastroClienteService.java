package com.julia.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.julia.brewer.model.Cliente;
import com.julia.brewer.repository.Clientes;
import com.julia.brewer.service.exception.CpfCnpjClienteJaCadastroException;

@Service
public class CadastroClienteService {
	
	@Autowired
	private Clientes clientes;
	
	@Transactional
	public void salvar(Cliente cliente) {
		Optional<Cliente> clienteExistente = clientes.findByCpfOuCnpj(cliente.getCpfOuCnpjSemFormatacao());
		if (clienteExistente.isPresent()) {
			throw new CpfCnpjClienteJaCadastroException("CPF/CNPJ já cadastrado");
		}
		
		clientes.save(cliente);
	}
}
