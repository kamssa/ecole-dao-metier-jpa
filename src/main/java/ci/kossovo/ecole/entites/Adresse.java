package ci.kossovo.ecole.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse implements Serializable{

	
	private static final long serialVersionUID = 1L;
private String codepostal;

private String ville;
private String email;

@ElementCollection
private List<String> contact;


public Adresse() {
	super();
	// TODO Auto-generated constructor stub
}
public Adresse(String ville, String email) {
	super();
	this.ville = ville;
	this.email = email;
	
}
public String getCodepostal() {
	return codepostal;
}
public void setCodepostal(String codepostal) {
	this.codepostal = codepostal;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public List<String> getContact() {
	return contact;
}
public void setContact(List<String> contact) {
	this.contact = contact;
}


}
