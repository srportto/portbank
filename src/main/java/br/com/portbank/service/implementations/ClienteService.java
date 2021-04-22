package br.com.portbank.service.implementations;

import br.com.portbank.entity.Cliente;
import br.com.portbank.repository.ClienteRepository;
import br.com.portbank.service.interfaces.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente getClienteById(long id) {
        System.out.println("getClienteById()");
        return clienteRepository.findById(id).get();
    }

    @Override
    public List<Cliente> getAllClientes() {
        System.out.println("getAllClientes()");
        List<Cliente> lista = new ArrayList<>();
        clienteRepository.findAll().forEach(e -> lista.add(e));
        return lista;
    }

    public Cliente addCliente(Cliente cliente){
        System.out.println("addCliente()");
        System.out.println("esse eh o cliente que chegou: "+ cliente.toString());
        clienteRepository.save(cliente);
        return cliente;
    }

    public Cliente updateCliente(Cliente cliente) {
        System.out.println("apdateCliente()");
        System.out.println("esse eh o cliente que chegou: "+cliente.toString());
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(long id) {
        System.out.println("deleteCliente()");
        clienteRepository.delete(clienteRepository.findById(id).get());
    }
}
