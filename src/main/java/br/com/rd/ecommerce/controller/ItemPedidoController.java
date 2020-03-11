package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.ItemPedido;
import br.com.rd.ecommerce.model.Usuario;
import br.com.rd.ecommerce.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemPedidoController {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/itempedido")
    public List<ItemPedido> find() {return itemPedidoRepository.findAll();}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/itempedido")
    public ItemPedido save(@RequestBody ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

}
