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
@Table(name = "T_ETUDIANT_PROMO")
@IdClass(EtudiantPromoID.class)
public class EtudiantPromo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id 
	private Long id_promotion;
	
	@Id 
	private Long id_etudiant;
	
	
	
	
	private int annee;
	
	//fait reference a une matiere
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_etudiant",insertable=false,updatable=false)
	private Matiere matiere;
	//fait reference a une promotion
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "id_promotion",insertable=false,updatable=false)
	private Promotion promotion;
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
