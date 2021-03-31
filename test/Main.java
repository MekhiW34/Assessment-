package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {


        Manager manager = new Manager("Bob", .25);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mekhi", .10);
        Customer customer = new Customer("Hanna", 'S');

        Clothing shirt = new Clothing("blue Shirt", 25, 'M');
        Clothing hoodie = new Clothing("black hoodie", 50, 'M');
        Clothing jacket = new Clothing("Windbreaker", 65, 'M');
        Clothing jeans = new Clothing("Biker jeans", 45, 'L');

        Clothing[] managerCart = {shirt, hoodie, jeans, new Clothing("Anime Shirt", 20, 'M')};

        Clothing[] employeeCart = {jacket, jeans, shirt};


        //System.out.println(shirt.toString());

        ArrayList<Clothing> clothing = new ArrayList<Clothing>();
        clothing.add(jacket);
        clothing.add(jeans);
        clothing.add(hoodie);
        clothing.add(shirt);

        ShopApp.printEmployeeName(manager);
        ShopApp.printEmployeeName(hourlyEmployee);

        ShopApp.SortAndPrintClothingByPrice(clothing);


        System.out.println(ShopApp.calcTotal(employeeCart));




        //System.out.println(hourlyEmployee.toString());

        for (Clothing x : managerCart) {
        System.out.println(x);
        }

        for (Clothing x : employeeCart) {
            System.out.println(x);
        }








    }
}
