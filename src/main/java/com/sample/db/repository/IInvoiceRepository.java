package com.sample.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.db.entity.InvoiceEntity;


public interface IInvoiceRepository extends CrudRepository<InvoiceEntity, Integer> {
	
}
