public class Main {
    public static void main(String[] args) {
        Product gas = new Product(4, 10, "Gallon of gas");
        gas.printProduct();
        gas.getTotalCost();

        Product bear = new Product(2000, 2, "bear");
        bear.printProduct();
        bear.getTotalCost();
    }
}
