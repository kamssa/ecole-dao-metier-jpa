package ci.kossovo.ecole;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class DomainAndPersistence implements CommandLineRunner {
	/*private static final Logger log = LoggerFactory.getLogger(DomainAndPersistence.class);

	@Autowired
	private IPersonneMetier personneMetier;*/

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

		personneMetier.creer(new Administrateur("Mr", "C1234", "Jack", "Boyer", "Admin"));

	}

	@Bean
	public CommandLineRunner demo(IPersonneMetier personneRepository) {
		return (args) -> { // save a couple of customers
			log.info("Enregistrer des personnes dans la base de donnée:");
			log.info("-------------------------------");

			personneRepository.creer(new Personne("Mr", "0032", "Chloe", "O'Brian"));
			personneRepository.creer(new Personne("Mme", "0033", "Kim", "Bauer"));
			personneRepository.creer(new Personne("Mr","0034","David", "Palmer"));
			personneRepository.creer(new Personne("Mme","0035","Michelle", "Dessler"));

			log.info("Enregistrer des etudiants dans la base de donnée:");
			log.info("-------------------------------");

			personneRepository.creer(new Etudiant("Mr", "0037","Traore", "Abdoulaye", "A0101"));
			personneRepository.creer(new Etudiant("Mr", "0038","Diarra", "Drissa", "A0102"));
			personneRepository.creer(new Etudiant("Mr", "0039","Kouadio", "Marco", "A0103"));
			personneRepository.creer(new Etudiant("Mr", "0041","Kone", "Katinant", "A0104"));
			personneRepository.creer(new Etudiant("Mr", "0050","Allassane ", "Ouattara", "A0105"));

			log.info("Enregistrer des enseignants dans la base de donnée::");
			log.info("-------------------------------");
			personneRepository.creer(new Enseignant("Mr", "0062","Fostin", "kouame", "Permanent"));
			personneRepository.creer(new Enseignant("Mr", "0072","Hamed", "Bakayoko", "Journalier"));
			personneRepository.creer(new Enseignant("Mr", "0082","Kablan", "Duncan", "Contractuel"));

			log.info("Enregistrer des administrateurs dans la base de donnée::");
			log.info("-------------------------------");
			personneRepository.creer(new Administrateur("Mr", "0092","Fostin", "kouame", "Permanent"));
			personneRepository.creer(new Administrateur("Mr", "0132","Hamed", "Bakayoko", "Journalier"));
			personneRepository.creer(new Administrateur("Mr", "0432","Kablan", "Duncan", "Contractuel"));

			// fetch all customers
			log.info("afficher la liste de toutes les personnes enregistrer:");
			log.info("-------------------------------");
			for (Personne personne : personneRepository.findAll()) {
				log.info(personne.toString());
			}
			log.info("");

			// fetch an individual customer by ID Personne personne =
			personneRepository.chercherParId(1L);
			log.info("Retourne une personne à parir de son identifinant(1L):");
			log.info("--------------------------------");
			log.info("");
			log.info("");

		};*/
	}

}
