package com.traxcrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traxcrm.Entity.Lead;

public interface LeadRopository extends JpaRepository<Lead, Long> {

}
