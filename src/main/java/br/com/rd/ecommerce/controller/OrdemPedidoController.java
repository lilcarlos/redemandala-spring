package br.com.rd.ecommerce.controller;



import br.com.rd.ecommerce.model.OrdemPedido;
import br.com.rd.ecommerce.repository.OrdemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdemPedidoController {

    @Autowired
    private OrdemPedidoRepository ordemPedidoRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/ordempedido")
    public List<OrdemPedido> find() {return ordemPedidoRepository.findAll();}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/ordempedido")
    public OrdemPedido save(@RequestBody OrdemPedido ordemPedido) {
        return ordemPedidoRepository.save(ordemPedido);
    }
}
