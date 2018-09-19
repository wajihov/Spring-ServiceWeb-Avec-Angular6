package org.siid.web;

import java.util.List;

import org.siid.dao.ContactRepository;
import org.siid.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ContactRestService {

	@Autowired
	private ContactRepository contactRepository;

	@GetMapping(value = "/personnes")
	public List<Personne> getAllList() {
		return contactRepository.findAll();
	}

	@GetMapping(value = "/personnes/{id}")
	public Personne getOne(@PathVariable Long id) {
		return contactRepository.findOne(id);
	}

	@PostMapping(value = "/addPerson")
	public Personne save(@RequestBody Personne contact) {
		return contactRepository.save(contact);
	}

	/*
	 * @DeleteMapping(value = "/deletePerson/{id}") public void delete(@PathVariable
	 * Long id) {
	 * 
	 * Contact c = contactJpaRepository.findOne(id); if (c != null)
	 * contactJpaRepository.delete(c); else new RuntimeException("le contact : " +
	 * id + " introuvable");
	 * 
	 * contactRepository.delete(id); }
	 */

	@DeleteMapping(value = "/deletePerson/{id}")
	public boolean delete(@PathVariable Long id) {
		contactRepository.delete(id);
		return true;
	}

	@PutMapping(value = "/updatePerson/{id}")
	public Personne modifier(@RequestBody Personne c, @PathVariable Long id) {
		c.setId(id);
		return contactRepository.save(c);
	}

	@GetMapping(value = "/findPersons")
	public Page<Personne> chercherContact(@RequestParam(name = "mc", defaultValue = "") String motCle,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "5") int size) {
		return contactRepository.cherchePersonne("%" + motCle + "%", new PageRequest(page, size));
	}
}