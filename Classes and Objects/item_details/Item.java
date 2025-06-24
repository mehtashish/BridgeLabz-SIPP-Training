package item_details;

public class Item {
	private String itemCode;
	private String itemName;
	private double price;
	private int quantity;

	public Item(String itemCode, String itemName, double price, int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	private double totalCost() {
		return price * quantity;
	}

	public void displayDetails() {
		System.out.println("Item Code: " + itemCode);
		System.out.println("Item Name: " + itemName);
		System.out.println("Item Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Total Cost: " + totalCost());
	}
}