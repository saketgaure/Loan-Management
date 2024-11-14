package com.servicess;

import java.util.List;

import com.entity.Transaction;

public interface TransactionService {
	
	public Transaction addTransaction(Transaction trans);

	public List<Transaction> getTransactionsByCustId(int custId);

}
