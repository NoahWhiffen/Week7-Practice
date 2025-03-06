public class CountedItem extends PurchaseItem {
    private int quantity; 

    // Constructor for CountedItem, using the superclass constructor
    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return getUnitPrice() * quantity; 
    }

    @Override
    public String toString() {
        return super.toString() + " (Quantity: " + quantity + ") - Total: " + getPrice();
    }
}
