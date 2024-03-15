package Exercise1_Inventory_Control_System;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Instantiate
        clsInventory objInventory = new clsInventory();
        String option = "";
        //Menu
       do {
            option = JOptionPane.showInputDialog("Inventory Control System\n" +
                    "1. View current inventory\n " +
                    "2. Add new product\n"+
                    "3. Remove a product\n"+
                    "4. Log out\n" +
                    "Enter an option:");

           switch (option) {
               case "1":
                   JOptionPane.showMessageDialog(null, objInventory.listProduct());
                   break;
               case "2":
                   String idProduct = JOptionPane.showInputDialog("Enter product id");
                   String nameProduct = JOptionPane.showInputDialog("Enter product name");
                   double priceProduct = Double.parseDouble(JOptionPane.showInputDialog("Enter product value"));
                   String categoryProduct = JOptionPane.showInputDialog("Enter product category");
                   String brandProduct = JOptionPane.showInputDialog("Enter product brand name");
                   clsSpecificProduct objProduct = new clsSpecificProduct(idProduct, nameProduct, priceProduct, categoryProduct,brandProduct);
                   objInventory.addProduct(objProduct);

                   break;
               case "3":
                   String idRemove = JOptionPane.showInputDialog("Enter id of the product to delete");
                   objInventory.deleteProducts(idRemove);
                   break;
               case "4":
                   JOptionPane.showMessageDialog(null,"exiting the system","",JOptionPane.INFORMATION_MESSAGE);
                   break;
               default:
                   JOptionPane.showMessageDialog(null,"ERROR\nInvalid option ✖️✖️","",JOptionPane.ERROR_MESSAGE);
                   break;
           }
        }while(!option.equals("4"));







        //Remove a product
/*        System.out.println("before remove products:");
        objInventory.listProduct();

        System.out.println("after remove products:");
        objInventory.deleteProducts("1");
        objInventory.listProduct();*/




    }
}