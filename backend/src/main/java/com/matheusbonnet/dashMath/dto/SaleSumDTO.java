package com.matheusbonnet.dashMath.dto;

import java.io.Serializable;

import com.matheusbonnet.dashMath.entities.Seller;

public class SaleSumDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sallerName;
	private Double sum;
	
	public SaleSumDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleSumDTO(Seller saller, Double sum) {
		this.sallerName = saller.getName();
		this.sum = sum;
	}

	public String getSallerName() {
		return sallerName;
	}

	public void setSallerName(String sallerName) {
		this.sallerName = sallerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
