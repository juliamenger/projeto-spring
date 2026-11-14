package com.projeto.atividades.recado.service;

import com.projeto.atividades.recado.model.Recado;
import com.projeto.atividades.recado.repository.RecadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecadoService {
    private final RecadoRepository repository;

    public RecadoService(RecadoRepository repository) {
        this.repository = repository;
    }

    public List<Recado> listar() {
        return repository.findAll();
    }

    public Recado cadastrar(Recado recado) {
        return repository.save(recado);
    }
}
