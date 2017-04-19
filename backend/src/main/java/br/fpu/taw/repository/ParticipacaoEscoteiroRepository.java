package br.fpu.taw.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.fpu.taw.model.Escoteiro;
import br.fpu.taw.model.ParticipacaoEscoteiro;
import br.fpu.taw.model.ParticipacaoEscoteiroId;
import br.fpu.taw.model.Reuniao;

public interface ParticipacaoEscoteiroRepository 
	extends CrudRepository<ParticipacaoEscoteiro, ParticipacaoEscoteiroId> {
	
	@Query("from ParticipacaoEscoteiro where id.escoteiro=?")
	Collection<ParticipacaoEscoteiro> findByEscoteiro(Escoteiro escoteiro);
	
	
	@Query("from ParticipacaoEscoteiro where id.reuniao=?")
	Collection<ParticipacaoEscoteiro> findByReuniao(Reuniao reuniao);
}
