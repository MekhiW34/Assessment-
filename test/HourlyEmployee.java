package test;

public class HourlyEmployee extends Employee implements IDiscountable{


    public HourlyEmployee(String name) {
        super("Mekhi", 'm', .10);

    }

    public double getDiscount(double discount, double price) {
        return (price * discount) / 100;
    }

        @Override
    public String toString() {
        return "Employee's name is: ";
    }

    @Override
    public void calcDiscount(double discount) {
        System.out.println(getDiscount(.10, 100));
    }
}
