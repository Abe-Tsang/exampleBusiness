public class Product {
    private String name;
    private String brand;
    private double weight;
    private double price;

    public Product(){
        name = "";
        brand = "";
        weight = 0.0;
        price = 0.0;
    }
    public Product(String _name, String _brand, double _weight, double _price){
        name = _name;
        brand = _brand;
        weight = _weight;
        price = _price;
    }

    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public double getWeight(){
        return weight;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }

    public String toString(){
        return name + " " + "[" + brand + ", " + weight + "]" + " " + "$" + price;
    }
}
