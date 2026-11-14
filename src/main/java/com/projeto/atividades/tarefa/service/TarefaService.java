package com.projeto.atividades.tarefa.service;

import com.projeto.atividades.recado.repository.RecadoRepository;
import com.projeto.atividades.tarefa.model.Tarefa;
import com.projeto.atividades.tarefa.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public Tarefa cadastrar(Tarefa tarefa) {
        return repository.save(tarefa);
    }
}
