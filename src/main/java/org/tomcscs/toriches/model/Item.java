package org.tomcscs.toriches.model;

public class Item {
	int code;
	String name;
	int price;
	double minRate;
	double maxRate;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getMinRate() {
		return minRate;
	}

	public void setMinRate(double minRate) {
		this.minRate = minRate;
	}

	public double getMaxRate() {
		return maxRate;
	}

	public void setMaxRate(double maxRate) {
		this.maxRate = maxRate;
	}

}
