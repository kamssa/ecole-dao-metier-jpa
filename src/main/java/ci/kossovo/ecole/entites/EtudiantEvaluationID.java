package ci.kossovo.ecole.entites;

import java.io.Serializable;

public class EtudiantEvaluationID implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id_etudiant;
	private Long id_evaluation;
	public Long getId_etudiant() {
		return id_etudiant;
	}
	public void setId_etudiant(Long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}
	public Long getId_evaluation() {
		return id_evaluation;
	}
	public void setId_evaluation(Long id_evaluation) {
		this.id_evaluation = id_evaluation;
	}
	
	
}
