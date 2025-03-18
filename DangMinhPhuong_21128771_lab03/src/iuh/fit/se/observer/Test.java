package iuh.fit.se.observer;

public class Test {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.0);

        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        appleStock.register(investor1);
        appleStock.register(investor2);

        appleStock.setPrice(155.0);
        appleStock.setPrice(160.0);
    }
}
