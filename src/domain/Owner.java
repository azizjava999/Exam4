package domain;

public class Owner {
    private String name;
    private String password = String.valueOf(12345);

    public Owner(String name, String password) {
        this.name = name;
        this.password = String.valueOf(12345);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
