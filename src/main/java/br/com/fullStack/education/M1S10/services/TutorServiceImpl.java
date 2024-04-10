package br.com.fullStack.education.M1S10.services;

import br.com.fullStack.education.M1S10.entities.TutorEntity;
import br.com.fullStack.education.M1S10.exceptions.NotFoundException;
import br.com.fullStack.education.M1S10.repositories.TutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TutorServiceImpl implements TutorService {

    private final TutorRepository repository;

    @Override
    public List<TutorEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public TutorEntity buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(
                        () -> new NotFoundException("Tutor não encontrado com id: " + id)
                );
    }

    @Override
    public TutorEntity criar(TutorEntity entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    @Override
    public TutorEntity alterar(Long id, TutorEntity entity) {
        buscarPorId(id);
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public void excluir(Long id) {
        TutorEntity entity = buscarPorId(id);
        repository.delete(entity);
    }
}
