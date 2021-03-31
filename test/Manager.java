package test;

public class Manager extends Employee implements IDiscountable{


    public Manager(String name, double discount) {
        super("Mary", 'L', .25);

    }

    @Override
    public void calcDiscount(double discount, double price) {
        System.out.println();
    }


}
