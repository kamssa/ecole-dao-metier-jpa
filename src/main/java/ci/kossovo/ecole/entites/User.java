package ci.kossovo.ecole.entites;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="T_USERS")
public class User extends AbstractEntity {

private static final long serialVersionUID = 1L;
private String login;
private String password;
private boolean actived;
@OneToOne
@JoinColumn(name="type_personne")
private Personne id_personne;
@JoinColumn(name="id_personne",insertable=false,updatable=false)
private long idpersonne;
public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isActived() {
	return actived;
}
public void setActived(boolean actived) {
	this.actived = actived;
}
@Override
public String toString() {
	return String.format("User[%s,%s,%s%s]" , login,password,actived,id_personne);
}

}
