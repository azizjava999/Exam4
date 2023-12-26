package ownerService;

import domain.Category;
import domain.Product;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface OwnerService {
    List<Category> categories = new LinkedList<>();
    Set<Product> products = new TreeSet<>();
    List<Integer> productsValues = new LinkedList<>();
    Category addCategory(Category category);
    Category editCategory(int index, Category category);
    Product addProduct(Product product);
    Product deleteProduct(int index);
    Product editProduct(int index, Product product);
    void showProducts();
}
