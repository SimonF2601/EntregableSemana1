package Exercise2_Inventory_Control_System;

import Exercise1_Inventory_Control_System.clsSpecificProduct;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class clsEmployeeManagement {
    //Attributes
    ArrayList<clsEmployee> employeeList ;
    //Constructor

    public clsEmployeeManagement() {
        this.employeeList = new ArrayList<>();
    }

    //Methods
    public void addEmployee(clsEmployee newEmployee){
        this.employeeList.add(newEmployee);
    }

    //TODO: Preguntar a kevin acerca de esta herencia
    public void deleteEmployeeForId(String id){this.employeeList.removeIf(employee -> employee.getIdEmployee().equals(id));
        }

    public clsEmployee searchById(String id){
        for (int i = 0; i <this.employeeList.size() ; i++) {
            if(this.employeeList.get(i).getIdEmployee().equals(id)){
                return  this.employeeList.get(i);
            }
        }
        return null;
    }

    public void listEmployee(){
        for(clsEmployee iterable : this.employeeList){
            System.out.println(iterable.toString());
        }
    }
}

