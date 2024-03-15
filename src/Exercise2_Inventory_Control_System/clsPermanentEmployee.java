package Exercise2_Inventory_Control_System;

public class clsPermanentEmployee extends clsEmployee {
    //Attributes
    private String typeEmployee;
    //Constructor
    public clsPermanentEmployee(){

    }

    public clsPermanentEmployee(String name, int age, String idEmployee, float wage, String typeEmployee) {
        super(name, age, idEmployee, wage);
        this.typeEmployee = typeEmployee;
    }

    //Methods
    public clsPermanentEmployee(String typeEmployee) {
        this.typeEmployee = typeEmployee;
    }

    //Getters and Setters

    public String getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(String typeEmployee) {
        this.typeEmployee = typeEmployee;
    }
}
