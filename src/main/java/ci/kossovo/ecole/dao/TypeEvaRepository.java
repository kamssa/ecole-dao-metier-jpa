package ci.kossovo.ecole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.kossovo.ecole.entites.TypeEvaluation;



public interface TypeEvaRepository extends JpaRepository<TypeEvaluation, Long> {

}
