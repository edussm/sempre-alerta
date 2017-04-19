package br.fpu.taw.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fpu.taw.model.Patrulha;
import br.fpu.taw.repository.PatrulhaRepository;

@Service
public class PatrulhaService {
	@Autowired
	PatrulhaRepository patrulhaRepository;
	
	public Optional<Collection<Patrulha>> listar() {
		return Optional.of(patrulhaRepository.findAll());
	}
	
	public Optional<Patrulha> buscarPorId(Long id) {
		return Optional.of(patrulhaRepository.findOne(id));
	}

	public Optional<Patrulha> criar(Patrulha patrulha) {
		if (patrulha == null || patrulha.getId() != null) {
			throw new IllegalArgumentException();
		}
		return Optional.ofNullable(patrulhaRepository.save(patrulha));
	}

	public Optional<Patrulha> atualizar(Patrulha patrulha) {
		if (patrulha == null || patrulha.getId() == null) {
			throw new IllegalArgumentException();
		}
		return Optional.ofNullable(patrulhaRepository.save(patrulha));
	}

	public void apagar(Long id) {
		if (id == null) {
			throw new IllegalArgumentException();
		}
		patrulhaRepository.delete(id);
	}
	
}
