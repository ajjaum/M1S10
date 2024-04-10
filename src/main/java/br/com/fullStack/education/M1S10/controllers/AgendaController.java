package br.com.fullStack.education.M1S10.controllers;

import br.com.fullStack.education.M1S10.entities.AgendaEntity;
import br.com.fullStack.education.M1S10.services.AgendaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agendas")
@AllArgsConstructor
public class AgendaController {

    private final AgendaService service;

    @GetMapping
    public ResponseEntity<List<AgendaEntity>> get() {
        return ResponseEntity.ok(service.buscarTodos());
    }

    @GetMapping("{id}")
    public ResponseEntity<AgendaEntity> getId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping("aluno-id/{alunoId}")
    public ResponseEntity<List<AgendaEntity>> getAlunoId(@PathVariable Long alunoId) {
        return ResponseEntity.ok(service.buscarPorAlunoId(alunoId));
    }

    @GetMapping("tutor-id/{tutorId}")
    public ResponseEntity<List<AgendaEntity>> getTutorId(@PathVariable Long tutorId) {
        return ResponseEntity.ok(service.buscarPorTutorId(tutorId));
    }

    @GetMapping("aluno-id/{alunoId}/proximos")
    public ResponseEntity<List<AgendaEntity>> getProximosAlunoId(@PathVariable Long alunoId) {
        return ResponseEntity.ok(service.buscarProximosPorAlunoId(alunoId));
    }

    @GetMapping("tutor-id/{tutorId}/proximos")
    public ResponseEntity<List<AgendaEntity>> geProximostTutorId(@PathVariable Long tutorId) {
        return ResponseEntity.ok(service.buscarPorTutorId(tutorId));
    }

    @PostMapping
    public ResponseEntity<AgendaEntity> post(@RequestBody AgendaEntity request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(request));
    }

    @PutMapping("{id}")
    public ResponseEntity<AgendaEntity> put(@PathVariable Long id, @RequestBody AgendaEntity request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.alterar(id, request));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }


}
