package br.com.fullStack.education.M1S10.repositories;

import br.com.fullStack.education.M1S10.entities.AgendaEntity;
import br.com.fullStack.education.M1S10.entities.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
}
