package unoesc.api.unoescapispringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import unoesc.api.unoescapispringboot.entities.AcaoEntity;

@Component
public interface AcaoRepository extends JpaRepository<AcaoEntity, Long> {

}
