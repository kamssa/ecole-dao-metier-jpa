package ci.kossovo.ecole.entites;

import java.io.Serializable;

public class EtudiantPromoID implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id_promotion;
	private Long id_etudiant;
	
	
	
	public EtudiantPromoID() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EtudiantPromoID(Long id_promotion, Long id_etudiant) {
		super();
		this.id_promotion = id_promotion;
		this.id_etudiant = id_etudiant;
	}

	public Long getId_promotion() {
		return id_promotion;
	}
	public void setId_promotion(Long id_promotion) {
		this.id_promotion = id_promotion;
	}
	public Long getId_etudiant() {
		return id_etudiant;
	}
	public void setId_etudiant(Long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}
	
}
