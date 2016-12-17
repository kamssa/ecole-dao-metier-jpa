package ci.kossovo.ecole;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class DomainAndPersistence implements CommandLineRunner {
	// private static final Logger log =
	// LoggerFactory.getLogger(DomainAndPersistence.class);

	/*@Autowired
	private IPersonneMetier personneMetier;
*/
	public static void main(String[] args) {
		SpringApplication.run(DomainAndPersistence.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
/*
		personneMetier.creer(new Personne("MME", "C0987", "Toure", "Mohamed"));
		personneMetier.creer(new Etudiant("Mr", "C87654", "Diarra", "Drissa", "A009", "Non Re"));
		personneMetier.creer(new Enseignant("Mme", "C98765", "camara", "Candia", "Permanent"));

		personneMetier.creer(new Administrateur("Mr", "C1234", "Jack", "Boyer", "Admin"));*/

	}

	/*
	 * @Bean public CommandLineRunner demo(IPersonneMetier personneRepository) {
	 * return (args) -> { // save a couple of customers
	 * log.info("Enregistrer des personnes dans la base de donnée:");
	 * log.info("-------------------------------");
	 * 
	 * personneRepository.creer(new Personne("Jack", "Bauer"));
	 * personneRepository.creer(new Personne("Chloe", "O'Brian"));
	 * personneRepository.creer(new Personne("Kim", "Bauer"));
	 * personneRepository.creer(new Personne("David", "Palmer"));
	 * personneRepository.creer(new Personne("Michelle", "Dessler"));
	 * 
	 * log.info("Enregistrer des etudiants dans la base de donnée:");
	 * log.info("-------------------------------");
	 * 
	 * personneRepository.creer(new Etudiant("Traore", "Abdoulaye", "A0101"));
	 * personneRepository.creer(new Etudiant("Diarra", "Drissa", "A0102"));
	 * personneRepository.creer(new Etudiant("Kouadio", "Marco", "A0103"));
	 * personneRepository.creer(new Etudiant("Kone", "Katinant", "A0104"));
	 * personneRepository.creer(new Etudiant("Allassane ", "Ouattara",
	 * "A0105"));
	 * 
	 * log.info("Enregistrer des enseignants dans la base de donnée::");
	 * log.info("-------------------------------"); personneRepository.creer(new
	 * Enseignant("Fostin", "kouame", "Permanent"));
	 * personneRepository.creer(new Enseignant("Hamed", "Bakayoko",
	 * "Journalier")); personneRepository.creer(new Enseignant("Kablan",
	 * "Duncan", "Contractuel"));
	 * 
	 * log.info("Enregistrer des administrateurs dans la base de donnée::");
	 * log.info("-------------------------------"); personneRepository.creer(new
	 * Administrateur("Fostin", "kouame", "Permanent"));
	 * personneRepository.creer(new Administrateur("Hamed", "Bakayoko",
	 * "Journalier")); personneRepository.creer(new Administrateur("Kablan",
	 * "Duncan", "Contractuel"));
	 * 
	 * // fetch all customers
	 * log.info("afficher la liste de toutes les personnes enregistrer:");
	 * log.info("-------------------------------"); for (Personne personne :
	 * personneRepository.findAll()) { log.info(personne.toString()); }
	 * log.info("");
	 * 
	 * // fetch an individual customer by ID Personne personne =
	 * personneRepository.chercherParId(1L);
	 * log.info("Retourne une personne à parir de son identifinant(1L):");
	 * log.info("--------------------------------");
	 * log.info(personne.toString()); log.info("");
	 * 
	 * 
	 * 
	 * // fetch customers by last name log.
	 * info("Personne de type etudiant retourne à partir de son amtricule:A0101"
	 * ); log.info("--------------------------------------------"); for
	 * (Personne bauer : personneRepository.chercherParMartricule("A0101")) {
	 * log.info(bauer.toString()); } log.info(""); // fetch customers by last
	 * name log.
	 * info("Personne de type eseignant retourne à partir de son statut:Permanent"
	 * ); log.info("--------------------------------------------"); for
	 * (Personne bauer : personneRepository.chercherParStatut("Permanent")) {
	 * log.info(bauer.toString()); }
	 * 
	 * }; }
	 */

}
