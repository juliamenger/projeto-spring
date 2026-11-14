package com.projeto.atividades.tarefa.repository;

import com.projeto.atividades.tarefa.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
