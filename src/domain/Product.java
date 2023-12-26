package domain;

public class Product {
    private static int sequence = 0;

    static {
        sequence++;
    }
    private Integer id = sequence;
    private String name;
    private Category category;



    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
