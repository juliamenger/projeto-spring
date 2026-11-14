package com.projeto.atividades.tarefa.controller;

import com.projeto.atividades.recado.model.Recado;
import com.projeto.atividades.tarefa.model.Tarefa;
import com.projeto.atividades.tarefa.service.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listar();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarefa cadastrar(@RequestBody Tarefa tarefa) {
        return service.cadastrar(tarefa);
    }

}
