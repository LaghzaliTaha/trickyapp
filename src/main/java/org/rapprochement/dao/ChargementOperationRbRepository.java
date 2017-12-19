package org.rapprochement.dao;

import org.rapprochement.entities.ChargementOperationRb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ChargementOperationRbRepository extends JpaRepository<ChargementOperationRb, Long>{

}
