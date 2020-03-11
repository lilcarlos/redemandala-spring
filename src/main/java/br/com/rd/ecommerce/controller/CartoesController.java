package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Cartoes;
import br.com.rd.ecommerce.repository.CartoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartoesController {

    @Autowired
    private CartoesRepository cartoesRepository;

    @GetMapping("/cartoes")
    public List<Cartoes> find() {return cartoesRepository.findAll();}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/cartoes")
    public Cartoes save(@RequestBody Cartoes cartoes) {
        return cartoesRepository.save(cartoes);
    }

}
