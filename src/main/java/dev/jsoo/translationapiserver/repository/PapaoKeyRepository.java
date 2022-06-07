package dev.jsoo.translationapiserver.repository;

import dev.jsoo.translationapiserver.entity.PapaoKey;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PapaoKeyRepository extends R2dbcRepository<PapaoKey, Long> {
}
