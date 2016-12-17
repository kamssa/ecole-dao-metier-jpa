package ci.kossovo.ecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.kossovo.ecole.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
/*List<User> findByLogin(String login);
// liste des roles d'un uilisateur
@Query("select ur.role from UserRole ur where ur.user.id=1?")
List<Role> getRoles(Long id);

@Query("select ur.role from UserRole where ur.user.login=? and ur.user.password=?2")
List<Role> getRoles(Long login,String password);*/
}
