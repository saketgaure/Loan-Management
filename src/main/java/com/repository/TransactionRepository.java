package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.entity.Transaction;

@Repository
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Integer> {
	@Query("select t from Transaction t inner join Loan l on l.loanId=t.loan.loanId where l.customer.id=?1")
	List<Transaction> findTransactionsByCustomerId(int customerId);


}
