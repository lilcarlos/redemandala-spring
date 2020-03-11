package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.Usuario;
import br.com.rd.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/usuario")
    public List<Usuario> find() {return usuarioRepository.findAll();}


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/usuario")
    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
