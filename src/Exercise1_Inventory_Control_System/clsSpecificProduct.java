package Exercise1_Inventory_Control_System;

public class clsSpecificProduct extends clsProduct {
    //Attributes
    private  String category;
    private String brand;
    //Contructor
    public clsSpecificProduct(String id, String name, double price, String category, String brand) {
        super(id, name, price);
        this.category = category;
        this.brand = brand;
    }

    //Methods

    @Override
    public String toString() {
        return super.toString() +
                "category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                "}\n "  ;
    }

    //Gettters and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
