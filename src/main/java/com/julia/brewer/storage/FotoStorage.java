package com.julia.brewer.storage;

import org.springframework.web.multipart.MultipartFile;

public interface FotoStorage {

	public void salvarTemporariamente(MultipartFile[] files);
	
}
