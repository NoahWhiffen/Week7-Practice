public class WeighedItem extends PurchaseItem {
    private double weight; // weight in kg

    // Constructor for WeighedItem, using the superclass constructor
    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    // Getter and setter for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Overriding getPrice method to calculate price based on weight
    @Override
    public double getPrice() {
        return getUnitPrice() * weight; // price = unit price * weight
    }

    // Overriding toString method to return a receipt-friendly string
    @Override
    public String toString() {
        return super.toString() + " (Weight: " + weight + "kg) - Total: " + getPrice();
    }
}