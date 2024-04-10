package br.com.fullStack.education.M1S10.services;

import br.com.fullStack.education.M1S10.entities.MaterialEntity;

import java.util.List;

public interface MaterialService {

    List<MaterialEntity> buscarTodos();

    MaterialEntity buscarPorId(Long id);

    MaterialEntity criar(MaterialEntity entity);

    MaterialEntity alterar(Long id, MaterialEntity entity);

    void excluir(Long id);

    List<MaterialEntity> buscarPorAgenda(Long agendaId);

}
