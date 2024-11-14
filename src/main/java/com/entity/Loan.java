package com.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {
	@Id
	@Column
	private int loanId;
	@Column
	private double loanAmt;
	@Column
	private String loanType;
	@Column
	private int duration;
	@Column
	private double monthlyEMI;
	@ManyToOne
	@JoinColumn(name="id",insertable=false,updatable = false)
	private Customer customer;
	@OneToMany(mappedBy = "loan",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Transaction> transactions = new ArrayList<Transaction>();
	public Loan(int loanId, double loanAmt, String loanType, int duration, double monthlyEMI, Customer customer,
			List<Transaction> transactions) {
		super();
		this.loanId = loanId;
		this.loanAmt = loanAmt;
		this.loanType = loanType;
		this.duration = duration;
		this.monthlyEMI = monthlyEMI;
		this.customer = customer;
		this.transactions = transactions;
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getMonthlyEMI() {
		return monthlyEMI;
	}
	public void setMonthlyEMI(double monthlyEMI) {
		this.monthlyEMI = monthlyEMI;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmt=" + loanAmt + ", loanType=" + loanType + ", duration=" + duration
				+ ", monthlyEMI=" + monthlyEMI + ", customer=" + customer + ", transactions=" + transactions + "]";
	
	}
	public void addTransaction(Transaction transation) {
		transation.setLoan(this);
		this.getTransactions().add(transation);
	}
}
