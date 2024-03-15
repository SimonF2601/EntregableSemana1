import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        //Menu
 /*       do {
            JOptionPane.showInputDialog("Inventory Control System\n" +
                    "1.View current inventory ");
        }while(true);
*/

        //Instantiate
        clsSpecificProduct objProduct = new clsSpecificProduct("1","Pencil",2000,"Stationery", "Big");
        clsSpecificProduct objProduct2 = new clsSpecificProduct("2","Notebook",6000,"Stationery", "Norma");
        clsInventory objInventory = new clsInventory();

        //Use class methods
        objInventory.addProduct(objProduct);
        objInventory.addProduct(objProduct2);

        System.out.println("List Products:");
        objInventory.listProduct();

        //Remove a product
/*        System.out.println("before remove products:");
        objInventory.listProduct();

        System.out.println("after remove products:");
        objInventory.deleteProducts("1");
        objInventory.listProduct();*/

        //Searches
        System.out.println("Searches");
        System.out.println(objInventory.searchByCategory("Stationery"));
        System.out.println(objInventory.searchByName("Pencil"));


    }
}