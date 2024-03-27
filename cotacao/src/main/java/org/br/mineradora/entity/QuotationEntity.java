package org.br.mineradora.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.math.BigDecimal;

@Entity //quando a aplicação iniciar esta notação vai estar falando que a class QuotationEntity pertence a uma entidade do nosso banco de dados
@Table(name = "quotation") //instanciando o nome da nossa tabela no banco de dados que no caso e quotation
@Data
@NoArgsConstructor
public class QuotationEntity {

    @Id // definindo como identificador unico
    @GeneratedValue //definimos que cada vez que entrar um novo intem na nossa tabela sera incrementado automaticamente o ID.
    private Long id;

    private Date date;

    @Column(name="corrency_price") //aqui  definimos para o java qual coluna no banco que estamos querendo definir
    private BigDecimal currencyPrice;

    @Column(name="pct_change")
    private String pctChange;

    private String pair;

}
