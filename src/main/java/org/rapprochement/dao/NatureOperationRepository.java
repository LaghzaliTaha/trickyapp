package org.rapprochement.dao;


import org.rapprochement.entities.NatureOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NatureOperationRepository extends JpaRepository<NatureOperation, Long>{

}
