package br.edu.unoesc.desafiofullstackunoesc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unoesc.desafiofullstackunoesc.entities.AuxilioEmergencialEntity;

@Repository
public interface AuxilioEmergencialRepository extends JpaRepository<AuxilioEmergencialEntity, Long>{
    
}
