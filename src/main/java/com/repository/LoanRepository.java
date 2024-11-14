package com.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.entity.Customer;
import com.entity.Loan;

@Repository
public interface LoanRepository extends PagingAndSortingRepository<Loan, Integer> {
	@Query("select l from Loan l where l.id=?1")
	Customer findByCustomerId(int custId);	

}
