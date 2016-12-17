package ci.kossovo.ecole.entites;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(EtudiantCoursID.class)
public class EtudiantCours implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	    @Id private Long id_etudiant;
	    @Id private Long id_cours;
	    private boolean absence;
	    private String motif;
	    // lien vers la classe Etudiant
	    @ManyToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name="id_etudiant",insertable=false,updatable=false)
	    private Etudiant etudiant;
	    // lien vers la classe Cours
	    @ManyToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name="id_cours",insertable=false,updatable=false)
	    private Cours cours;
	    
	    
		public EtudiantCours(boolean absence, String motif) {
			super();
			this.absence = absence;
			this.motif = motif;
		}
		public boolean isAbsence() {
			return absence;
		}
		public void setAbsence(boolean absence) {
			this.absence = absence;
		}
		public String getMotif() {
			return motif;
		}
		public void setMotif(String motif) {
			this.motif = motif;
		}

		@Override
		public String toString() {
			return String.format("EtudiantCours[%s,%s,%s,%s]" , id_etudiant,id_cours,absence,motif);
		}

	    
}
