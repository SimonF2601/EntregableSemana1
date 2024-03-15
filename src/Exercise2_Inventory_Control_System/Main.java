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
                    employeeList.listEmployee();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
            }
        } while (!option.equals("4"));


    }
}
