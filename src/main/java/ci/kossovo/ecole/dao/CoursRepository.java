package ci.kossovo.ecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.kossovo.ecole.entites.Cours;




public interface CoursRepository extends JpaRepository<Cours, Long> {

}
