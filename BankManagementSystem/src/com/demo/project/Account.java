package com.demo.project;

public class Account {
	    private int accNo;
	    private String name;
	    private String mobileNo;
	    private String adharNo;
	    private double balance;
		public int getAccNo() {
			return accNo;
		}
		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getAdharNo() {
			return adharNo;
		}
		public void setAdharNo(String adharNo) {
			this.adharNo = adharNo;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public Account() {
			super();
		}
		public Account(int accNo, String name, String mobileNo, String adharNo, double balance) {
			super();
			this.accNo = accNo;
			this.name = name;
			this.mobileNo = mobileNo;
			this.adharNo = adharNo;
			this.balance = balance;
		}
		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", name=" + name + ", mobileNo=" + mobileNo + ", adharNo=" + adharNo
					+ ", balance=" + balance + "]";
		}
		
}