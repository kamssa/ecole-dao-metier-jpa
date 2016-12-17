package ci.kossovo.ecole.entites;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS_ROLES")
public class UserRole extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	// un userRole fait reference a un role
	@ManyToOne
	@JoinColumn(name = "ROLE_ID")
	private Role role;
	// getter et setter

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
