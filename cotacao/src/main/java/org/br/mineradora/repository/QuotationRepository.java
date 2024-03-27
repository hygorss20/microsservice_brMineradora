package org.br.mineradora.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.entity.QuotationEntity;

@ApplicationScoped //segnifica quando o Quarkus startar, vai identificar que esta class sera administrada pelo mesmo
public class QuotationRepository implements PanacheRepository<QuotationEntity> {
}
