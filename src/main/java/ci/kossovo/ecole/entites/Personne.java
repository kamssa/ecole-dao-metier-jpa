package ci.kossovo.ecole.entites;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Table(name = "T_PERSONNE")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE_PERSONNE", discriminatorType = DiscriminatorType.STRING, length = 2)
@DiscriminatorValue("PE")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(name = "ET", value = Etudiant.class), @Type(name = "EN", value = Enseignant.class),
		@Type(name = "AD", value = Administrateur.class) })
public class Personne extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String titre;
	private String cni;
	private String nom;
	private String prenom;
	private String nomComplet;

	private String description;

	@Embedded
	private Adresse adresse;
	@Column(name = "TYPE_PERSONNE", insertable = false, updatable = false)
	private String type;

	public Personne() {
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String titre, String cni, String nom, String prenom) {
		super();
		this.titre = titre;
		this.cni = cni;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNomComplet() {
		return nomComplet;
	}

	@PrePersist
	public void setNomComplet() {
		this.nomComplet = nom + " " + prenom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	@Override
	public String toString() {
		return String.format("Personne[%s,%s,%s,%s]", id, titre, nomComplet, version);
	}

}
