package ci.kossovo.ecole.entites;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_COURS")
public class Cours extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	private String libelle;
	private String contenu;
	
	@Temporal(TemporalType.DATE)
	private Date dateCours = new Date();
	
	private String duree;
	private String description;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Matiere id_matiere;
	 @Column(name="id_matiere",insertable=false,updatable=false)
	 private long idmatiere;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Promotion id_promotion;
	@Column(name="id_matiere",insertable=false,updatable=false)
	private long idpromotion;
   
	public Cours() {
		super();
			}

	
	public Cours(String libelle, Date dateCours, String duree, String description) {
		super();
		this.libelle = libelle;
		this.dateCours = dateCours;
		this.duree = duree;
		this.description = description;
	}


	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateCours() {
		return dateCours;
	}

	public void setDateCours(Date dateCours) {
		this.dateCours = dateCours;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
		@Override
	public String toString() {
		return String.format("Cours[%s,%s,%s]" , id,id_matiere,id_promotion);
	}


		public String getContenu() {
			return contenu;
		}


		public void setContenu(String contenu) {
			this.contenu = contenu;
		}
		

}
