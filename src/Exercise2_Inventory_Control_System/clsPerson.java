package Exercise2_Inventory_Control_System;

public class clsPerson {
    //Attributes
    private String name;
    private int age;

    //Constructor

    public clsPerson() {
    }

    public clsPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Methods

    @Override
    public String toString() {
        return "clsPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
