package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Endereco;
import br.com.rd.ecommerce.model.Usuario;
import br.com.rd.ecommerce.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/endereco")
    public List<Endereco> find() {return enderecoRepository.findAll();}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/endereco")
    public Endereco save(@RequestBody Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

}
