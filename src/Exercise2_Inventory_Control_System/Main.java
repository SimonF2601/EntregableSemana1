package Exercise2_Inventory_Control_System;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Create a global variable
        String option = "";
        clsEmployeeManagement employeeList = new clsEmployeeManagement();

        //Create a menu
        do {
            option = JOptionPane.showInputDialog("Employee Registration System 💁‍♂️💁🏽‍\n\n️" +
                    "1. Display list of employees\n" +
                    "2. adding an employee\n" +
                    "3. removing an employee\n" +
                    "4. log off");

            switch (option) {
                case "1":
                    JOptionPane.showMessageDialog(null, employeeList.listEmployee());
                    break;
                case "2":
                    String optionEmployee =JOptionPane.showInputDialog("What type of employee will you add?\n" +
                            "1. Permanent\n" +
                            "2. Temporary\n" +
                            "enter an option");

                    if (optionEmployee.equals("1")){
                        String name = JOptionPane.showInputDialog("enter employee's name");
                        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "enter employee's age:"));
                        String idEmployee = JOptionPane.showInputDialog("enter employee's id:");
                        float wage = Float.parseFloat(JOptionPane.showInputDialog("enter employee's salary:"));
                        String typeEmployee = "Permanent";
                        int yearOld = Integer.parseInt(JOptionPane.showInputDialog(null, "enter employee's age in Company:"));
                        clsPermanentEmployee objEmployee = new clsPermanentEmployee(name,age,idEmployee,wage,typeEmployee, yearOld);
                        employeeList.addEmployee(objEmployee);
                    } else if (optionEmployee.equals("2")) {
                        String name = JOptionPane.showInputDialog("enter employee's name");
                        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "enter employee's age:"));
                        String idEmployee = JOptionPane.showInputDialog("enter employee's id:");
                        float wage = Float.parseFloat(JOptionPane.showInputDialog("enter employee's salary:"));
                        String typeEmployee = "Temporary";
                        String dateContractEnd = JOptionPane.showInputDialog(null, "enter employee's age in Company:");
                        clsTemporaryEmployee objEmployee = new clsTemporaryEmployee(name,age,idEmployee,wage,typeEmployee, dateContractEnd);
                        employeeList.addEmployee(objEmployee);
                    }
                    break;
                case "3":
                    employeeList.deleteEmployeeForId("1");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null,"exiting the system","",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:

                    break;
            }
        } while (!option.equals("4"));


    }
}
