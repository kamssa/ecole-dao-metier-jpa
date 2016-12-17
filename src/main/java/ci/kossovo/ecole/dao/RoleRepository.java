package ci.kossovo.ecole.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.kossovo.ecole.entites.Role;

public interface RoleRepository  extends JpaRepository<Role, Long>{
List<Role> findByRoleNom(String rolenom);
}
