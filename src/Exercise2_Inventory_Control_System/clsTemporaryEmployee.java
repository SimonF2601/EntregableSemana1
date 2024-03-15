package Exercise2_Inventory_Control_System;

public class clsTemporaryEmployee extends clsEmployee {
    //Attributes
    private String typeEmployee;
    //Constructor
    public clsTemporaryEmployee (){

    }

    public clsTemporaryEmployee(String name, int age, String idEmployee, float wage, String typeEmployee) {
        super(name, age, idEmployee, wage);
        this.typeEmployee = typeEmployee;
    }

    //Methods

    @Override
    public String toString() {
        return "clsTemporaryEmployee{" +
                "typeEmployee='" + typeEmployee + '\'' +
                "} " + super.toString();
    }

    //Getters and Setters
    public String getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(String typeEmployee) {
        this.typeEmployee = typeEmployee;
    }
}
