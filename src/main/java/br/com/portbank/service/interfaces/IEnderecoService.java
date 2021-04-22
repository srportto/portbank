package br.com.portbank.service.interfaces;

import br.com.portbank.entity.Cliente;
import br.com.portbank.entity.Endereco;

import java.util.List;

public interface IEnderecoService {
    Endereco getEnderecoById(long id);

    Endereco addEndereco(Endereco endereco);

    Endereco updateEndereco(Endereco endereco);

    void deleteEndereco(long id);
}
