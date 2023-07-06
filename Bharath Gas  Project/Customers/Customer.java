package Customers;
import gasSupplier.*;
public class Customer implements gasAgency{
    public String name;
    public String mobile;
    public String Street;
    public String area;
    public String pincode;

    public Customer(String name, String mobile, String street, String area, String pincode) {
        this.name = name;
        this.mobile = mobile;
        Street = street;
        this.area = area;
        this.pincode = pincode;
    }
}
