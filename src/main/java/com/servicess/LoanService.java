package com.servicess;

import java.util.List;

import com.entity.Loan;

public interface LoanService {
	public Loan applyLoan(Loan l);

	public List<Loan> getLoansByCustomerId(int custId);

	public void foreCloseLoan(int loanId);

}
