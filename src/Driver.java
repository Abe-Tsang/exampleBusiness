import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    public static void main(String[] args) throws IOException {
        int choice = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a product");
            System.out.println("2. Add a customer");
            System.out.println("3. Quit");
            choice = Integer.parseInt(bufferedReader.readLine());
            if(choice == 1){
                String name = "";
                String brand = "";
                double weight = 0.0;
                double price = 0.0;

                System.out.println("What is the name of the product?");
                name = bufferedReader.readLine();
                System.out.println("What is the brand of the product?");
                brand = bufferedReader.readLine();
                System.out.println("What is the weight of the product?");
                weight = Double.parseDouble(bufferedReader.readLine());
                System.out.println("What is the price of the product?");
                price = Double.parseDouble(bufferedReader.readLine());

                Product p = new Product(name, brand, weight, price);

                System.out.println(p.toString());

            }
            else if(choice == 2){
                String name = "";
                String address = "";
                String phoneNumber = "";

                System.out.println("What is the name of the customer?");
                name = bufferedReader.readLine();
                System.out.println("What is the address of the customer?");
                address = bufferedReader.readLine();
                System.out.println("What is the phone number of the customer?");
                phoneNumber = bufferedReader.readLine();

                Customer c = new Customer(name, address, phoneNumber);

                System.out.println(c.toString());

            }
            else if(choice == 3){
                System.out.println("Bye!!!");
                break;
            }
            else{
                System.out.println("Try Again!!!");
            }
        }while(choice != 3);
    }
}
