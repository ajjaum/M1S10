package br.com.fullStack.education.M1S10.repositories;

import br.com.fullStack.education.M1S10.entities.AgendaEntity;
import br.com.fullStack.education.M1S10.entities.AlunoEntity;
import br.com.fullStack.education.M1S10.entities.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {

    List<MaterialEntity> findByAgenda(AgendaEntity agenda);
}
