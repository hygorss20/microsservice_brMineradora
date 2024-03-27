package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Jacksonized//permite que a class e o atributo seja unido para um JSON, ou seja eu posso transferir esta class para json ou receber um Json para Java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyPriceDTO {

    public USDBRL USDBRL;

}
