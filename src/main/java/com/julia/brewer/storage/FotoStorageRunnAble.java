package com.julia.brewer.storage;

import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.multipart.MultipartFile;

public class FotoStorageRunnAble implements Runnable {

	private MultipartFile[] files;
	private DeferredResult<String> resultado;
	
	public FotoStorageRunnAble(MultipartFile[] files, DeferredResult<String> resultado) {
		this.files = files;
		this.resultado = resultado;
	}
	
	@Override
	public void run() {
		System.out.println(">>>> files: " + files[0].getSize());
		//TODO: Salvar a foto no sistema de arquivos...
		resultado.setResult("Ok! Foto recebida.");
	}

}
