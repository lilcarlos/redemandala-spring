package br.com.rd.ecommerce.controller;


import br.com.rd.ecommerce.model.Endereco;
import br.com.rd.ecommerce.model.Estoque;
import br.com.rd.ecommerce.model.Usuario;
import br.com.rd.ecommerce.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstoqueController {

    @Autowired
    private EstoqueRepository estoqueRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/estoque")
    public List<Estoque> find() {return estoqueRepository.findAll();}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/estoque")
    public Estoque save(@RequestBody Estoque estoque) {
        return estoqueRepository.save(estoque);
    }
}
