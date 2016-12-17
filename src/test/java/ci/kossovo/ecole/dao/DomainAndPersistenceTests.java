package ci.kossovo.ecole.dao;
/*package ci.kossovo.ecole;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ci.kossovo.ecole.entites.Personne;
import ci.kossovo.ecole.metier.IPersonneMetier;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DomainAndPersistenceTests {
	@Autowired
	private IPersonneMetier ipersonneMetier;

	@Test
	public void test() {
		// engeristrer une personne
		ipersonneMetier.creer(new Personne("Diarra", "Drissa"));
		ipersonneMetier.creer(new Personne("Traore", "Abdoulaye"));

		// la liste des personne enregistres
		List<Personne> personne = ipersonneMetier.findAll();
		display("Liste des personne :", personne);

	}

	// méthode utilitaire - affiche les éléments d'une collection
	private void display(String message, Iterable<?> elements) {
		System.out.println(message);
		for (Object element : elements) {
			System.out.println(element);
		}
	}
}
*/