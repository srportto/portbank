package br.com.portbank.controller;

import java.util.List;

import br.com.portbank.dto.ClienteDTO;
import br.com.portbank.entity.Cliente;
import br.com.portbank.entity.Endereco;
import br.com.portbank.service.interfaces.IClienteService;
import br.com.portbank.service.interfaces.IEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @Autowired
    private IEnderecoService enderecoService;

    @GetMapping("clientes/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable("id") Long id) {
        Cliente cliente = clienteService.getClienteById(id);

        if (cliente != null) {
            return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("clientes")
    public ResponseEntity<List<Cliente>> getAllClientes() {
        List<Cliente> lista = clienteService.getAllClientes();
        return new ResponseEntity<List<Cliente>>(lista, HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente addCliente(@RequestBody Cliente cliente) {

        Endereco enderecoSalvo = enderecoService.addEndereco(cliente.getEndereco());
        cliente.setEndereco(enderecoSalvo);
        Cliente savedCliente = clienteService.addCliente(cliente);

        //ClienteDTO clienteDTO = new ClienteDTO(savedCliente);
        //System.out.println(clienteDTO.toString());

        return savedCliente;
    }

    @PutMapping
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente) {
        clienteService.updateCliente(cliente);
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @DeleteMapping("clientes/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable("id") Long id) {
        System.out.println("id que chegou no delete: " + id);
        clienteService.deleteCliente(id);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
