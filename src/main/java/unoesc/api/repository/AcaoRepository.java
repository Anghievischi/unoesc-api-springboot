package unoesc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import unoesc.api.unoescapispringboot.entities.AcaoEntity;

@Repository
@Component
public interface AcaoRepository extends JpaRepository<AcaoEntity, Long> {

}
