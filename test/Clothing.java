package test;

public class Clothing {

    private String description;
    private double price;
    private char size;


    public Clothing(String description, double price, char size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "This is a : " + getDescription() + " it cost: " + getPrice() + " and the size is a : " + getSize();
    }



}

