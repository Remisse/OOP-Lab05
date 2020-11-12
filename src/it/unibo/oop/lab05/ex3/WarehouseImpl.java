package it.unibo.oop.lab05.ex3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {
	
	private static final double EMPTY_STOCK = 0.0;
	private final Set<Product> set;
	
	public WarehouseImpl() {
		this.set = new LinkedHashSet<>();
	}
	
	public WarehouseImpl(Collection<? extends Product> products) {
		this.set = new LinkedHashSet<>(products);
	}

	public void addProduct(Product p) {
		this.set.add(p);
	}

	public Set<String> allNames() {
		Set<String> out = new LinkedHashSet<>();
		for (final Product p : this.set) {
			out.add(p.getName());
		}
		return out;
	}

	public Set<Product> allProducts() {
		return Set.copyOf(this.set);
	}

	public boolean containsProduct(Product p) {
		return this.set.contains(p);
	}

	public double getQuantity(String name) {
		for (final Product p : this.set) {
			if (p.getName().compareTo(name) == 0) {
				return p.getQuantity();
			}
		}
		return EMPTY_STOCK;
	}
}
