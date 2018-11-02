public class Customer {
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(){
        name = "";
        address = "";
        phoneNumber = "";
    }
    public Customer(String _name, String _address, String _phoneNumber){
        name = _name;
        address = _address;
        phoneNumber = _phoneNumber;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String toString(){
        return name + " " + "(" + phoneNumber + ")" + " " + "[" + address + "]";
    }
}
