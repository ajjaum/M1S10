package br.com.fullStack.education.M1S10.services;

import br.com.fullStack.education.M1S10.entities.TutorEntity;

import java.util.List;

public interface TutorService {

    List<TutorEntity> buscarTodos();

    TutorEntity buscarPorId(Long id);

    TutorEntity criar(TutorEntity entity);

    TutorEntity alterar(Long id, TutorEntity entity);

    void excluir(Long id);
}
