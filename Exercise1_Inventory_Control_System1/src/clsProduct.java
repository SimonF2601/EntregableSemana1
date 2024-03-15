public class clsProduct {

    //Attributes
    private  String id;
    private  String name;
    private  double price;

    //Contructor

    public clsProduct() {
    }

    public clsProduct(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //Methods
    @Override
    public String toString() {
        return "Exercise1_Invenory_Control_System.clsProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price + ", "
                ;
    }

    // Gettters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
