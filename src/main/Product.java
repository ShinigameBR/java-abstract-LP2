package main;

public class Product extends Entity {
    private double price;
    private String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean validar() {
        if (getPrice() >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public String fileName() {
        return getName();
    }

    public String getName() {
        return name;
    }
}
