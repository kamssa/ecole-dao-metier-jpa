package ci.kossovo.ecole.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_ROLES")
public class Role extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String roleNom;
	private String description;

	public Role() {

	}

	public Role(String roleNom, String description) {
		this.roleNom = roleNom;
		this.description = description;
	}

	public String getRoleNom() {
		return roleNom;
	}

	public void setRoleNom(String roleNom) {
		this.roleNom = roleNom;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
