package domain;

public class Customer {
    private static int sequence = 0;

    static{
        sequence++;
    }
    private Integer id = sequence;
    private String fullName;
    private String userName;
    private String password;
    private String phoneNumber;

    public Customer(String fullName, String userName, String password, String phoneNumber) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public Customer(String fullName, String password) {
        this.fullName = fullName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
