package br.com.portbank.service.implementations;

import br.com.portbank.entity.Endereco;
import br.com.portbank.repository.EnderecoRepository;
import br.com.portbank.service.interfaces.IEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService implements IEnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public Endereco getEnderecoById(long id) {
        return enderecoRepository.findById(id).get();
    }

    @Override
    public Endereco addEndereco(Endereco endereco) {

        enderecoRepository.save(endereco);
        return endereco;
    }

    @Override
    public Endereco updateEndereco(Endereco endereco) {

        return enderecoRepository.save(endereco);

    }

    @Override
    public void deleteEndereco(long id) {
        enderecoRepository.delete(enderecoRepository.findById(id).get());
    }
}
