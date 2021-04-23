package br.com.portbank.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Data                                               //add toString, equalsAndHascode, getters , setters via lombok
@EqualsAndHashCode(onlyExplicitlyIncluded = true)   //informa que na geracao do equals e hashcode do lombok para considerar apenas os atribudos incluidos explicitamente ... vide cpf abaixo
@Entity
@Table(name = "tab_clientes")
public class Cliente implements Serializable {
    private static final long serialVerionUID = 1L;

    @EqualsAndHashCode.Include  //informacao ao lombok que esse atributo deve ser considerado pra gerar equals and hashcode
    @Id
    private long cpfId;


    @Column(name = "nome_completo", nullable = false)
    private String nomeCompleto;

    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;

    @Column(name = "tipo_pessoa",  nullable = false)
    private char tipoDePessoa;

    @OneToOne                           //exemplo mapeamento bi direcional (cliente tem endereco e endereco tem cliente)
    @JoinColumn(name="id_endereco_clie")
    private Endereco endereco;

    public int obterIdade(){
        LocalDate dataCorrente = LocalDate.now();

        // conversao de Date para Localdate
        LocalDate dataNascimento = this.dataNascimento.toInstant().atZone(ZoneId.systemDefault() ).toLocalDate();

        Period periodo = Period.between(dataNascimento,dataCorrente);


        // getYears retorna um int
        return periodo.getYears();

    }
}
