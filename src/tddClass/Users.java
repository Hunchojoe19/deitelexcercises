package tddClass;

public class Users {
    private String name;
    private Customers customers;
    private Sellers sellers;
    private Admins admins;
    private int age;
    private String email_address;
    private Address home_address;
    private String password;
    private String phoneNumber;

    public Users(String name, int age, String email_address, Address home_address, String password, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email_address = email_address;
        this.home_address = home_address;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}
