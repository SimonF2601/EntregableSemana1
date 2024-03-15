import java.util.ArrayList;

public class clsInventory {
    //Attributes
    private ArrayList<clsSpecificProduct> productsList;

    //Constructor
    public clsInventory(){
        this.productsList = new ArrayList<>();
    }

    public void addProduct (clsSpecificProduct product){
        this.productsList.add(product);
    }

    public void deleteProducts (String id){
        this.productsList.removeIf(product -> product.getId().equals(id));
    }

    public void  listProduct(){
        for(clsSpecificProduct iterable : this.productsList){
            System.out.println(iterable.toString());
        }
    }

    public clsSpecificProduct searchByName(String nameSearch){
        for(clsSpecificProduct iterable : this.productsList){
            if (iterable.getName().equalsIgnoreCase(nameSearch)){
                return iterable;
            };
        }
        return null;
    }

    public clsSpecificProduct searchByCategory(String categorySearch){
        for(clsSpecificProduct iterable : this.productsList){
            if (iterable.getCategory().equalsIgnoreCase(categorySearch)){
                return iterable;
            };
        }
        return null;
    }
}
