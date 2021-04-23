package br.com.portbank.service.interfaces;


import br.com.portbank.entity.Conta;
import br.com.portbank.entity.ContaId;

import java.util.List;

public interface IContaService {
    List<Conta> getAllContas();
    List<Conta> getAllContasCliente(Long idCliente);
    Conta getContaById(ContaId contaId);
    Conta addConta(Conta conta);
    Conta updateConta(Conta conta);
    void deleteConta(ContaId contaId);
}
