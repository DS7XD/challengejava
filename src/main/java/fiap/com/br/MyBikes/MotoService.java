package com.mybikes.locacoes.service;

import com.mybikes.locacoes.model.Moto;
import com.mybikes.locacoes.repository.MotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoService {

    private final MotoRepository repository;

    public MotoService(MotoRepository repository) {
        this.repository = repository;
    }

    public List<Moto> listarTodas() {
        return repository.findAll();
    }

    public Moto salvar(Moto moto) {
        return repository.save(moto);
    }

    public Moto buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarPorId(Integer id) {
        repository.deleteById(id);
    }
}
