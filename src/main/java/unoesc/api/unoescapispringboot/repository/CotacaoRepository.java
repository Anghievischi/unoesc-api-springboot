package unoesc.api.unoescapispringboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import unoesc.api.unoescapispringboot.entities.CotacaoEntity;

@Component
public interface CotacaoRepository extends JpaRepository<CotacaoEntity, Long> {

}
