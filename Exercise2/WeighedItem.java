public class WeighedItem extends PurchaseItem {
    private double weight;

    // Constructor for WeighedItem, using the superclass constructor
    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return getUnitPrice() * weight;
    }

    @Override
    public String toString() {
        return super.toString() + " (Weight: " + weight + "kg) - Total: " + getPrice();
    }
}