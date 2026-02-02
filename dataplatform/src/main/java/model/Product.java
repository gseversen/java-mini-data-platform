package model;

public class Product {

    //attributes of product
    private String name;
    private String brand;
    private String category;
    private double price;
    private int stock;
    private String availability;

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

    public String toString()
    {
        return this.getName() + " | " + this.getBrand() + " | " + this.getPrice();
    }

}// class end
