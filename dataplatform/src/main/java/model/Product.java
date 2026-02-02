package model;

public class Product {

    //attributes of product
    private final String name;
    private final String brand;
    private final String category;
    private final double price;
    private final int stock;
    private final String availability;

    public Product(String name, String brand, String category, double price, int stock, String availability) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.availability = availability;
    }
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getAvailability() {
        return availability;
    }

    @Override
    public String toString()
    {
        return this.getName() + " | " + this.getBrand() + " | " + this.getPrice();
    }

}// class end
