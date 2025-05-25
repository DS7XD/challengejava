
package com.mybikes.locacoes.service;

import com.mybikes.locacoes.model.Locacao;
import com.mybikes.locacoes.repository.LocacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocacaoService {

    private final LocacaoRepository repository;

    public LocacaoService(LocacaoRepository repository) {
        this.repository = repository;
    }

    public List<Locacao> listarTodas() {
        return repository.findAll();
    }

    public Locacao salvar(Locacao locacao) {
        return repository.save(locacao);
    }

    public Locacao buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarPorId(Integer id) {
        repository.deleteById(id);
    }
} 
