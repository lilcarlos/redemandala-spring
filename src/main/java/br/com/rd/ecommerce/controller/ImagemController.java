package br.com.rd.ecommerce.controller;


import br.com.rd.ecommerce.model.Cartoes;
import br.com.rd.ecommerce.model.Imagem;
import br.com.rd.ecommerce.model.Usuario;
import br.com.rd.ecommerce.repository.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImagemController {

    @Autowired
    private ImagemRepository imagemRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/imagem")
    public List<Imagem> find() {return imagemRepository.findAll();}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/imagem")
    public Imagem save(@RequestBody Imagem imagem) {
        return imagemRepository.save(imagem);
    }
}
