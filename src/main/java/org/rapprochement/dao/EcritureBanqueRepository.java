package org.rapprochement.dao;


import org.rapprochement.entities.EcritureBanque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcritureBanqueRepository extends JpaRepository<EcritureBanque, Long> {

}
