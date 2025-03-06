public class PurchaseItem {
    private String name;
    private double unitPrice;

    // Constructor to initialize instance variables
    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    // Default constructor
    public PurchaseItem() {
        this.name = "no item";
        this.unitPrice = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return name + " @ " + unitPrice;
    }
}
