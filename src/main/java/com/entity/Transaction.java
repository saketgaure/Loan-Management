package com.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	@Column
	private int transId;
	@Column
	private Timestamp transTime;
	@Column
	private String mssg;
	
	@ManyToOne
	@JoinColumn(name="loanId",insertable = false,updatable = false)
	private Loan loan;

	public Transaction(int transId, Timestamp transTime, String mssg, Loan loan) {
		super();
		this.transId = transId;
		this.transTime = transTime;
		this.mssg = mssg;
		this.loan = loan;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public Timestamp getTransTime() {
		return transTime;
	}

	public void setTransTime(Timestamp transTime) {
		this.transTime = transTime;
	}

	public String getMssg() {
		return mssg;
	}

	public void setMssg(String mssg) {
		this.mssg = mssg;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", transTime=" + transTime + ", mssg=" + mssg + ", loan=" + loan
				+ "]";
	}
	

}
