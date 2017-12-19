package org.rapprochement.services;


import org.rapprochement.dao.BanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BanqueService {

	@Autowired
	BanqueRepository monDAO;

	
	
}
