package com.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String gender;
	@Column
	private long phone;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String confirmPassword;
	@Column
	private float salary;
	@Column
	private long adhaar;
	@Column
	private String pan;
	@Column
	private double walletAmt;
	@Column
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Loan> loans = new ArrayList<Loan>();
	public Customer(int id, String fname, String lname, String gender, long phone, String email, String password,
			String confirmPassword, float salary, long adhaar, String pan, double walletAmt, List<Loan> loans) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.salary = salary;
		this.adhaar = adhaar;
		this.pan = pan;
		this.walletAmt = walletAmt;
		this.loans = loans;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getWalletAmt() {
		return walletAmt;
	}
	public void setWalletAmt(double walletAmt) {
		this.walletAmt = walletAmt;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", phone="
				+ phone + ", email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", salary=" + salary + ", adhaar=" + adhaar + ", pan=" + pan + ", walletAmt=" + walletAmt + ", loans="
				+ loans + "]";
	}
	
	

}
