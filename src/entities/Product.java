package entities;

public class Product {

	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product() {
	}

	public Product(Integer id, String name, Double price, Integer quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}


	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void addStock(int amount) {
		if (amount > 0) {
			quantity += amount;
		}
	}
	
	public void removeStock(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
        }
    }
	
	public String toString() {
		return "ID: " + id + ", Nome: " + name + ", Preço: " + String.format("%.2f", price) +
				", Quantidade: " + quantity;
	}
	
	
}
