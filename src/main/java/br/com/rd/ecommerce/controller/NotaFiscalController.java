package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.NotaFiscal;
import br.com.rd.ecommerce.model.Usuario;
import br.com.rd.ecommerce.repository.NotaFiscalRepository;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotaFiscalController {

    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/notafiscal")
    public List<NotaFiscal> find() {return notaFiscalRepository.findAll();}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/notafiscal")
    public NotaFiscal save(@RequestBody NotaFiscal notaFiscal) {
        return notaFiscalRepository.save(notaFiscal);
    }
}
