package br.com.portbank.service.implementations;

import br.com.portbank.entity.Cliente;
import br.com.portbank.entity.Conta;
import br.com.portbank.entity.ContaId;
import br.com.portbank.repository.ContaRepository;
import br.com.portbank.service.interfaces.IContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContaService implements IContaService {
    @Autowired
    private ContaRepository contaRepository;

    @Override
    public List<Conta> getAllContas() {
        List<Conta> lista = new ArrayList<>();
        contaRepository.findAll().forEach(e -> lista.add(e));
        return lista;
    }

    @Override
    public List<Conta> getAllContasCliente(Long idCliente) {
        return null;
    }

    @Override
    public Conta getContaById(ContaId contaId) {
        return null;
    }

    @Override
    public Conta addConta(Conta conta) {
        contaRepository.save(conta);
        return conta;
    }

    @Override
    public Conta updateConta(Conta conta) {
        return null;
    }

    @Override
    public void deleteConta(ContaId contaId) {

    }
}
