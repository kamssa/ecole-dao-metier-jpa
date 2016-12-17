package ci.kossovo.ecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.kossovo.ecole.entites.Evaluation;


public interface EtudiantEvaRepository extends JpaRepository<Evaluation, Long> {

}
