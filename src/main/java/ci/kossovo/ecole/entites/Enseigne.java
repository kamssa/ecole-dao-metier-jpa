package ci.kossovo.ecole.entites;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="T_ENSEIGNE")
@IdClass(EnseigneID.class)
public class Enseigne implements Serializable {
	
	@Id 
	private Long id_promotion;
	@Id 
	private Long id_matiere;
	@Id 
	private Long id_enseignant;
	
	private static final long serialVersionUID = 1L;
	
	
	private int annee;
	//fait reference a un enseignant
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_enseignant",insertable=false,updatable=false)
	private Enseignant enseignant;
	//fait reference a une matiere
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_matiere",insertable=false,updatable=false)
	private Matiere matiere;
	//fait reference a une promotion
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_promotion",insertable=false,updatable=false)
	private Promotion promotion;
	


	public Enseigne() {
		
	}

	public Enseigne(int annee) {
		super();
		this.annee = annee;
	}

	public Enseigne(int annee, Enseignant enseignant, Matiere matiere, Promotion promotion) {
		super();
		this.annee = annee;
		this.enseignant = enseignant;
		this.matiere = matiere;
		this.promotion = promotion;
	}

	int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
