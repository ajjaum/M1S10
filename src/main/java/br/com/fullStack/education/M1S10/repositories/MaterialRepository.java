package br.com.fullStack.education.M1S10.repositories;

import br.com.fullStack.education.M1S10.entities.AlunoEntity;
import br.com.fullStack.education.M1S10.entities.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {
}
