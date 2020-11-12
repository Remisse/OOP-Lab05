package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;

public class ComparableProduct implements Product, Comparable<Product> {
	
	private Product product;

	public ComparableProduct(Product p) {
		this.product = p;
	}
	
	public String getName() {
		return this.product.getName();
	}

	public double getQuantity() {
		return this.product.getQuantity();
	}

	public int compareTo(Product o) {
		return this.getName().compareTo(o.getName());
	}
	
	public String toString() {
		return this.product.toString();
	}
}
