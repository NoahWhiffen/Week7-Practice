public class CountedItem extends PurchaseItem {
    private int quantity; // quantity of items purchased

    // Constructor for CountedItem, using the superclass constructor
    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    // Getter and setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Overriding getPrice method to calculate price based on quantity
    @Override
    public double getPrice() {
        return getUnitPrice() * quantity; // price = unit price * quantity
    }

    // Overriding toString method to return a receipt-friendly string
    @Override
    public String toString() {
        return super.toString() + " (Quantity: " + quantity + ") - Total: " + getPrice();
    }
}
