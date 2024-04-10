package br.com.fullStack.education.M1S10.repositories;

import br.com.fullStack.education.M1S10.entities.MaterialEntity;
import br.com.fullStack.education.M1S10.entities.TutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<TutorEntity, Long> {
}
