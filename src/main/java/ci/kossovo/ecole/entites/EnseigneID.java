package ci.kossovo.ecole.entites;

import java.io.Serializable;

public class EnseigneID implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id_promotion;
	private Long id_matiere;
	private Long id_enseignant;

	public EnseigneID() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnseigneID(Long idPromotion, Long idMatiere, Long idEnseignant) {
		super();
		this.id_promotion = idPromotion;
		this.id_matiere = idMatiere;
		this.id_enseignant = idEnseignant;
	}
	 @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (long) id_enseignant;
	        hash += (long) id_promotion;
	        hash += (long) id_matiere;
	        return hash;
	    }

	    @Override
	    public boolean equals(Object object) {
	        if (!(object instanceof EnseigneID)) {
	            return false;
	        }
	        EnseigneID other=(EnseigneID)object;
	        if (this.id_enseignant!=other.id_enseignant) {
	            return false;
	        }
	        if (this.id_promotion != other.id_promotion) {
	            return false;
	        }
	        if (this.id_matiere != other.id_matiere) {
	            return false;
	        }
	        return true;
	    }

	
}
