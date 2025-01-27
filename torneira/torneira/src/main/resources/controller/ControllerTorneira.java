package com.torneira.torneira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/torneira")

public class ControllerTorneira {

    @Autowired
    private TorneiraService torneiraService;

   
    @GetMapping
    public List<Torneira> getAllTorneiras() {
        return torneiraService.getAllTorneiras();
    }

    
    @GetMapping("/{id}")
    public Torneira getTorneiraById(@PathVariable Long id) {
        return torneiraService.getTorneiraById(id);
    }


    @PostMapping
    public Torneira criarTorneira(@RequestBody Torneira torneira) {
        return torneiraService.createTorneira(torneira);
    }

    
    @PutMapping("/{id}")
    public Torneira atualizarTorneira(@PathVariable Long id, @RequestBody Torneira torneira) {
        return torneiraService.updateTorneira(id, torneira);
    }

  
    @DeleteMapping("/{id}")
    public void deletarTorneira(@PathVariable Long id) {
        torneiraService.deletarTorneira(id);
    }
}

