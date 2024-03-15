package Exercise2_Inventory_Control_System;

public class clsEmployee extends  clsPerson {
    //Attributes
    private String idEmployee;
    private float wage;
    //Constructor

    public clsEmployee() {
    }

    public clsEmployee(String name, int age, String idEmployee, float wage) {
        super(name, age);
        this.idEmployee = idEmployee;
        this.wage = wage;
    }

    //Methods
    @Override
    public String toString() {
        return "clsEmployee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", wage=" + wage +
                "} " + super.toString();
    }

    //Getters and Setters
    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
}
