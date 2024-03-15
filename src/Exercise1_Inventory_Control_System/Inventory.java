package Exercise1_Inventory_Control_System;

import java.util.ArrayList;

public class Inventory {
    //Attributes
    private ArrayList<SpecificProduct> productsList;

    //Constructor
    public Inventory(){
        this.productsList = new ArrayList<>();
    }

    //Methods
    public void addProduct (SpecificProduct product){
        this.productsList.add(product);
    }

    public void deleteProducts (String id){
        this.productsList.removeIf(product -> product.getId().equals(id));
    }

    public String listProduct(){
        String text = "";
        for(SpecificProduct iterable : this.productsList){
            text += iterable.toString();
        }
        return(text);
    }

    public SpecificProduct searchByName(String nameSearch){
        for(SpecificProduct iterable : this.productsList){
            if (iterable.getName().equalsIgnoreCase(nameSearch)){
                return iterable;
            };
        }
        return null;
    }

    public SpecificProduct searchByCategory(String categorySearch){
        for(SpecificProduct iterable : this.productsList){
            if (iterable.getCategory().equalsIgnoreCase(categorySearch)){
                return iterable;
            };
        }
        return null;
    }
}
