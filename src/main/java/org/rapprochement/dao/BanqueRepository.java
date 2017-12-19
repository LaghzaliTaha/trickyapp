package org.rapprochement.dao;

import org.rapprochement.entities.Banque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BanqueRepository extends JpaRepository<Banque, Long> {

}
