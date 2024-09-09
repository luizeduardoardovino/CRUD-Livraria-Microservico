package com.autorservice.autorservice.service;


import com.autorservice.autorservice.model.Autor;
import com.autorservice.autorservice.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> listarTodos() {
        return autorRepository.findAll();
    }

    public Optional<Autor> buscarPorId(Long id) {
        return autorRepository.findById(id);
    }

    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }

    public void deletarPorId(Long id) {
        autorRepository.deleteById(id);
    }
}
