package br.com.fullStack.education.M1S10.services;

import br.com.fullStack.education.M1S10.entities.AgendaEntity;
import br.com.fullStack.education.M1S10.entities.AlunoEntity;
import br.com.fullStack.education.M1S10.entities.MaterialEntity;
import br.com.fullStack.education.M1S10.exceptions.NotFoundException;
import br.com.fullStack.education.M1S10.repositories.MaterialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MaterialServiceImpl implements MaterialService {

    private final MaterialRepository repository;
    private final AgendaService agendaService;

    @Override
    public List<MaterialEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public MaterialEntity buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(
                        () -> new NotFoundException("Material não encontrado com id: " + id)
                );
    }

    @Override
    public MaterialEntity criar(MaterialEntity entity) {
        entity.setId(null);

        AgendaEntity agenda = agendaService.buscarPorId(entity.getAgenda().getId());
        entity.setAgenda(agenda);
        return repository.save(entity);
    }

    @Override
    public MaterialEntity alterar(Long id, MaterialEntity entity) {
        buscarPorId(id);
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void excluir(Long id) {
        MaterialEntity entity = buscarPorId(id);
        repository.delete(entity);
    }

    @Override
    public List<MaterialEntity> buscarPorAgenda(Long agendaId) {
        AgendaEntity agenda = agendaService.buscarPorId(agendaId);
        return repository.findByAgenda(agenda);
    }
}
