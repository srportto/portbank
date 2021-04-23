package br.com.portbank.repository;

import br.com.portbank.entity.Conta;
import br.com.portbank.entity.ContaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, ContaId> {
}
