package com.jzocateli.helpdesk.api.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jzocateli.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Optional<ChangeStatus> findByTicketIdOrderByDateChangeDesc(String ticketId);

}
