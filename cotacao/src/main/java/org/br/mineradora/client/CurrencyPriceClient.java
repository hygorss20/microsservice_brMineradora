package org.br.mineradora.client;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.br.mineradora.dto.CurrencyPriceDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/last") // monta a URL ou EndPoint do serviço
@RegisterRestClient // registre este serviço como rest disponibilizando para o ambiente externo da aplicação
@ApplicationScoped
public interface CurrencyPriceClient {


    @GET //Metodo
    @Path("/{pair}") //por estar dentro de {} oque quer dizer que o valor e passado pela URL ou seja o pair e o valor a ser passado.
    CurrencyPriceDTO getPriceByPair (@PathParam("pair")String pair);


}
