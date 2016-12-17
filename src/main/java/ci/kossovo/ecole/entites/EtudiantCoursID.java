package ci.kossovo.ecole.entites;

import java.io.Serializable;

public class EtudiantCoursID implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id_etudiant;
    private Long id_cours;
    
    
    public EtudiantCoursID() {
		super();
		
	}
	
	
	public EtudiantCoursID(Long id_etudiant, Long id_cours) {
		super();
		this.id_etudiant = id_etudiant;
		this.id_cours = id_cours;
	}


	public Long getIdEtudiant() {
		return id_etudiant;
	}
	public void setIdEtudiant(Long idEtudiant) {
		this.id_etudiant = idEtudiant;
	}
	public Long getIdCours() {
		return id_cours;
	}
	public void setIdCours(Long idCours) {
		this.id_cours = idCours;
	}
    
	 @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (long) id_etudiant;
	        hash += (long) id_cours;
	        return hash;
	    }

	   
	    @Override
	    public boolean equals(Object object) {
	        if (!(object instanceof EtudiantCoursID)) {
	            return false;
	        }
	        EtudiantCoursID other=(EtudiantCoursID)object;
	        if (this.id_cours!=other.id_cours) {
	            return false;
	        }
	        if (this.id_etudiant != other.id_etudiant) {
	            return false;
	        }
	        return true;
	    }
}
