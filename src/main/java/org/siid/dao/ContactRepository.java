package org.siid.dao;

import org.siid.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Personne, Long>  {

}
