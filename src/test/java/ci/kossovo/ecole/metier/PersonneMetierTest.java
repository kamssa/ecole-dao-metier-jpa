package ci.kossovo.ecole.metier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import ci.kossovo.ecole.dao.PersonneRepository;
import ci.kossovo.ecole.entites.Personne;
import ci.kossovo.ecole.exceptions.InvalidPersonneException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonneMetierTest {

	@Autowired
	private IPersonneMetier personneMetier;

	@MockBean
	private PersonneRepository repositoryMock;

	@Test
	public void creerUnePesonne() {
		// given
		Personne p1 = new Personne("Mr", "CN001", "Diarra", "Drissa");
		Personne p2 = new Personne("Mr", "CN001", "Diarra", "Drissa");
		p2.setId(2L);

		given(repositoryMock.save(p1)).willReturn(p2);
		// when
		Personne p3 = null;
		try {
			p3 = personneMetier.creer(p1);
		} catch (InvalidPersonneException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verify(repositoryMock).save(p1);
		assertThat(p3).isEqualTo(p2);

	}

	@Test
	public void creerUnePersonneSansNomPrenomEtCni() {
		Personne pe = new Personne();
		pe.setTitre("Mr");
		given(repositoryMock.save(pe))
				.willThrow(new RuntimeException("le nom ou le prenom ou le cni ne peut etre null"));

		Personne p = null;
		try {
			p = personneMetier.creer(pe);
		} catch (InvalidPersonneException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verify(repositoryMock, never()).save(pe);
		assertThat(p).isEqualTo(null);
	}

	@Test
	public void creerUnePersonneQuiExiste() {
		Personne p1 = new Personne("Mr", "A003", "Traore", "Abdoulaye");
		p1.setId(3L);

		given(repositoryMock.findByCni(p1.getCni())).willReturn(p1);

		Personne pers = null;
		try {
			Personne p2 = new Personne("Mr", "A003", "Diarra", "Drissa");
			pers = personneMetier.creer(p2);
		} catch (InvalidPersonneException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		verify(repositoryMock).findByCni(p1.getCni());
		verify(repositoryMock, never()).save(p1);
		assertThat(pers).isEqualTo(null);
	}

	@Test
	public void modifierUnePersonne() {
		// given

		Personne p1 = new Personne("Mr", "A003", "Traore", "Abdoulaye");
		p1.setId(4L);

		given(repositoryMock.findOne(p1.getId())).willReturn(p1);
		given(repositoryMock.findByCni(p1.getCni())).willReturn(p1);

		p1.setNom("Diarra");
		given(repositoryMock.save(p1)).willReturn(p1);
		Personne p2 = null;

		try {
			p2 = personneMetier.modifier(p1);

		} catch (InvalidPersonneException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verify(repositoryMock, never()).findByCni(p1.getCni());
		verify(repositoryMock).save(p1);
		assertThat(p2.getNom()).isEqualTo("Diarra");

	}

	@Test
	public void modifierPersonneAvecCniExistant() {
		// given

		Personne entityExistant = new Personne("Mr", "A003", "Traore", "Abdoulaye");
		entityExistant.setId(4L);

		Personne modifaApprte = new Personne("Mr", "A004", "Traore", "Abdoulaye");
		modifaApprte.setId(4L);
		
		Personne personneProprietaireCni = new Personne("Mr", "A004", "Soulama", "Oumar");
		personneProprietaireCni.setId(6L);
		
		given(repositoryMock.findOne(4L)).willReturn(entityExistant);
		given(repositoryMock.findByCni("A004")).willReturn(personneProprietaireCni);
        given(repositoryMock.save(modifaApprte)).willThrow(new RuntimeException("cette personne existe"));
		
        Personne p3 = null;

		try {
			p3 = personneMetier.modifier(modifaApprte);

		} catch (InvalidPersonneException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verify(repositoryMock).findByCni("A004");
		verify(repositoryMock,never()).save(modifaApprte);
		assertThat(p3).isEqualTo(null);
	}
}
