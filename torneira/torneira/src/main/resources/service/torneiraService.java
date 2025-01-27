package com.torneira.torneira.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class torneiraService {
	 
	@Autowired
	    private TorneiraRepository torneiraRepository;

	    
	    public TorneiraModel createTorneira(TorneiraModel torneira) {
	        if (torneira.getId() == null) {
	            torneira.setId(UUID.randomUUID()); 
	        }
	        return torneiraRepository.save(torneira);  
	    }

	    
	    public TorneiraModel getTorneiraById(UUID id) {
	        Optional<TorneiraModel> torneira = torneiraRepository.findById(id);
	        return torneira.orElse(null); 
	    }

	    
	    public List<TorneiraModel> getAllTorneiras() {
	        return torneiraRepository.findAll();  
	    }
	}
	

