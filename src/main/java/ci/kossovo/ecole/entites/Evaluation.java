package ci.kossovo.ecole.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_EVALUATION")
public class Evaluation extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEvaluation;

	private int duree;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_type_evaluation")
	private TypeEvaluation typeEvaluation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sale")
	private Sale sale;
	// fait reference a une matiere
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_matiere")
	private Matiere matiere;
	// fait reference a une promotion
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_promotion")
	private Promotion promotion;

	@Column(name = "id_type_evaluation", insertable = false, updatable = false)
	private long idtype_Evaluation;
	@Column(name = "id_matiere", insertable = false, updatable = false)
	private long idmatiere;
	@Column(name = "id_promotion", insertable = false, updatable = false)
	private long idpromotion;
	@Column(name = "id_sale", insertable = false, updatable = false)
	private long idsale;
	public Date getDateEvaluation() {
		return dateEvaluation;
	}
	public void setDateEvaluation(Date dateEvaluation) {
		this.dateEvaluation = dateEvaluation;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public TypeEvaluation getTypeEvaluation() {
		return typeEvaluation;
	}
	public void setTypeEvaluation(TypeEvaluation typeEvaluation) {
		this.typeEvaluation = typeEvaluation;
	}
	public Sale getSale() {
		return sale;
	}
	public void setSale(Sale sale) {
		this.sale = sale;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Promotion getPromotion() {
		return promotion;
	}
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	public long getIdtype_Evaluation() {
		return idtype_Evaluation;
	}
	public void setIdtype_Evaluation(long idtype_Evaluation) {
		this.idtype_Evaluation = idtype_Evaluation;
	}
	public long getIdmatiere() {
		return idmatiere;
	}
	public void setIdmatiere(long idmatiere) {
		this.idmatiere = idmatiere;
	}
	public long getIdpromotion() {
		return idpromotion;
	}
	public void setIdpromotion(long idpromotion) {
		this.idpromotion = idpromotion;
	}
	public long getIdsale() {
		return idsale;
	}
	public void setIdsale(long idsale) {
		this.idsale = idsale;
	}
	

	@Override
	public String toString() {
		return String.format("Personne[%s,%s]" ,dateEvaluation,duree);
	}

	
}
