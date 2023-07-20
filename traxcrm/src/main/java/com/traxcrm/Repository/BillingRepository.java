package com.traxcrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traxcrm.Entity.Billing;


public interface BillingRepository extends JpaRepository<Billing, Long> {

}
