package br.com.lucasnp.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.lucasnp.helpdesk.api.entity.ChangeStatus;


public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	
	Iterable<ChangeStatus> findByTicketIdOrderByDtChangedStatusDesc(String ticketId);
}
