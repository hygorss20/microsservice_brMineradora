package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.util.Date;

@Jacksonized//permite que a class e o atributo seja unido para um JSON, ou seja eu posso transferir esta class para json ou receber um Json para Java
@Data
@Builder
@AllArgsConstructor
public class QuatationDTO {

    private Date date;

    private BigDecimal currencyPrice;
}
