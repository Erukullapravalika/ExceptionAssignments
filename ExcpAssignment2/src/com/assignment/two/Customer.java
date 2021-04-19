package com.assignment.two;


public class Customer {
	private String custNo;
	private String custName;
	private String category;

	public Customer(String custNO,String custName,String category) throws InvalidInputException {
		if(custNO.startsWith("c")||custNo.startsWith("c"))
		    this.custNo=custNo;
		else
			throw new InvalidInputException("CustNo starts with c");
		if(custName.length()==4)
			this.custName=custName;
		else
			throw new InvalidInputException("Name must contain 4 characters only");
		if(category.equalsIgnoreCase("Platinum")||category.equalsIgnoreCase("Gold")||category.equalsIgnoreCase("Silver"))
		        this.category=category;
		else
		        
			throw new InvalidInputException("yours category is not in list");
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

	}



