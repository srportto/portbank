package br.com.portbank.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data                                               //add toString, equalsAndHascode, getters , setters via lombok
@EqualsAndHashCode(onlyExplicitlyIncluded = true)   //informa que na geracao do equals e hashcode do lombok para considerar apenas os atribudos incluidos explicitamente ... vide abaixo
@Entity
@Table(name = "tab_endereco")
public class Endereco implements Serializable {
    public static final long serialVerionUID = 1L;

    @EqualsAndHashCode.Include  //informacao ao lombok que esse atributo deve ser considerado pra gerar equals and hashcode
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private  String rua;

    private int numeroDaRua;
    private int cep;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String uf;

/*    @OneToOne(mappedBy = "endereco")    // atributo que garante o mapeamento bi-direcional
    private Cliente cliente;*/


}
