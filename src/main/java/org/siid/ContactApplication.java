package org.siid;

/*import java.text.DateFormat;
import java.text.SimpleDateFormat;*/

import org.siid.dao.ContactRepository;
import org.siid.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactApplication implements CommandLineRunner {

	@Autowired
	private ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		//DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		/*contactRepository.save(
				new Personne("wajih", "BOUFAIED", df.parse("10/01/1983"), "wajihov@hotmail.fr", 97472581, "1.jpg"));
		contactRepository
				.save(new Personne("sami", "Bani", df.parse("31/01/1995"), "samiv@hotmail.com", 97472581, "2.jpg"));
		contactRepository
				.save(new Personne("jihed", "Hassen", df.parse("15/09/1999"), "jihed@hotmail.com", 97472581, "3.jpg"));
		contactRepository.save(
				new Personne("wadi3", "Makourine", df.parse("21/05/1955"), "wadi3@hotmail.fr", 97472581, "4.jpg"));*/
		contactRepository.findAll().forEach(c -> {
			System.out.println("la personne : " + c.getNom() + " Prenom : " + c.getPrenom());
		});
		Personne p= contactRepository.findOne(8L);
		System.out.println(p.getId()+" la personne rechercher est  : " + p.getNom() + " Prenom : " + p.getPrenom());
		
	}
}
