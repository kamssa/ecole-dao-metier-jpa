package ci.kossovo.ecole.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_ETUDIANT_EVALAUTION")
@IdClass(EtudiantEvaluationID.class)
public class EtudiantEvaluation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Long id_etudiant;
	@Id
	private Long id_evaluation;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_evaluation",insertable=false,updatable=false)
	private Evaluation evaluation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_etudiant",insertable=false,updatable=false)
	private Etudiant etudiant;

	public EtudiantEvaluation(Evaluation evaluation, Etudiant etudiant) {
		super();
		this.evaluation = evaluation;
		this.etudiant = etudiant;
	}

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	@Override
	public String toString() {
		return String.format("Personne[%s,%s]" ,id_etudiant,id_evaluation);
	}

	
}
