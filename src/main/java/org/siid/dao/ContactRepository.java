package org.siid.dao;

import org.siid.entities.Personne;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends JpaRepository<Personne, Long>  {

	@Query("select p from Personne p where p.nom like :x")
	public Page<Personne> cherchePersonne(@Param("x") String mc, Pageable pageable);
	
}
