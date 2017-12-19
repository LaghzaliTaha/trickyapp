package org.rapprochement.dao;


import org.rapprochement.entities.ChargementOperationGl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ChargementOperationGlRepository extends JpaRepository<ChargementOperationGl, Long>{

}
