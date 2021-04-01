package test;

public class Person {

    private String name;

    public Person(String name, char size) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This person's name is : " + name;
    }


}
