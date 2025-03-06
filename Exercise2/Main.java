public class Main {
    public static void main(String[] args) {
        // Creating instances of WeighedItem and CountedItem
        WeighedItem apple = new WeighedItem("Apple", 3.5, 1.2); // 1.2 kg apple at 3.5 per kg
        CountedItem pencil = new CountedItem("Pencil", 1.2, 5); // 5 pencils at 1.2 each

        // Printing out the details of the items
        System.out.println(apple.toString());
        System.out.println(pencil.toString());
    }
}