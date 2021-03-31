package test;

public class HourlyEmployee extends Employee implements IDiscountable{


    public HourlyEmployee(String name, double discount) {
        super("Mekhi", 'M', .10);
    }

    @Override
    public void calcDiscount(double discount) {

    }
}
