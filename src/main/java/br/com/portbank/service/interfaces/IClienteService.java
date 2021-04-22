package br.com.portbank.service.interfaces;

import br.com.portbank.entity.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> getAllClientes();
    Cliente getClienteById(long id);
    Cliente addCliente(Cliente cliente);
    Cliente updateCliente(Cliente cliente);
    void deleteCliente(long id);
}
