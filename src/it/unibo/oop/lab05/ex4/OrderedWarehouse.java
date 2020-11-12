package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.Warehouse;

public class OrderedWarehouse implements Warehouse {
	
	private Warehouse warehouse;
	
	public OrderedWarehouse(Warehouse w) {
		this.warehouse = w;
	}
	
	public Set<Product> allProducts() {
		return new TreeSet<>(this.warehouse.allProducts());
	}

	public void addProduct(Product p) {
		this.warehouse.addProduct(p);
	}

	public Set<String> allNames() {
		return this.warehouse.allNames();
	}

	public boolean containsProduct(Product p) {
		return this.warehouse.containsProduct(p);
	}

	public double getQuantity(String name) {
		return this.warehouse.getQuantity(name);
	}
}
