package test;

public abstract class Employee extends Customer{

    private final double discount;

    public Employee(String name, char size, double discount) {
        super(name, size);
        this.discount = discount;

    }

    public void printEmpPriceAfterDiscount(Clothing clothing) {

    }

    public double getDiscount() {
        return discount;
    }


}
