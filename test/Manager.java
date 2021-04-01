package test;

public class Manager extends Employee implements IDiscountable{


    public Manager(String name, double discount) {
        super("Mary", 'L', .25);

    }

    public double getDiscount(double discount, double price) {
        return (price * discount) / 100;
    }

    @Override
    public String toString() {
        return "Manager's name is: ";
    }

    @Override
    public void calcDiscount(double discount) {
        System.out.println(getDiscount(.25, 100));
    }

}
