package test;

public abstract class Employee extends Customer{

    private final double discount;
    public double price;

    public Employee(String name, char size, double discount) {
        super(name, size);
        this.discount = discount;

    }

    public void printEmpPriceAfterDiscount(Clothing clothing) {
        double pay = clothing.getPrice() * discount;
        System.out.println();
    }

    public double getDiscount(double price, double discount) {
       return 0;
    }


}
