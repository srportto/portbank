package br.com.portbank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import br.com.portbank.entity.Cliente;
import org.springframework.stereotype.Repository;

//usando spring data jpa - ele ja nos fornece um generic DAO
// ele nos fornece os metodos create/delelete/upadate...
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
