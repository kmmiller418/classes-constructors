public class Product {
    private double cost;
    private int quantity;
    private String name;

    public Product (double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public void getTotalCost() {
        System.out.println("Total cost is " + cost * quantity);
    }

    public void printProduct() {
        System.out.println(name + " costs " + cost + " per unit and " + quantity + " were purchased");
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
