package br.com.fullStack.education.M1S10.services;

import br.com.fullStack.education.M1S10.entities.AgendaEntity;

import java.util.List;

public interface AgendaService {

    List<AgendaEntity> buscarTodos();

    AgendaEntity buscarPorId(Long id);

    AgendaEntity criar(AgendaEntity entity);

    AgendaEntity alterar(Long id, AgendaEntity entity);

    void excluir(Long id);

    List<AgendaEntity> buscarPorAlunoId(Long alunoId);

    List<AgendaEntity> buscarPorTutorId(Long tutorId);

    List<AgendaEntity> buscarProximosPorAlunoId(Long alunoId);

    List<AgendaEntity> buscarProximosPorTutorId(Long tutorId);

}
