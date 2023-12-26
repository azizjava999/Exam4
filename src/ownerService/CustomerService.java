package ownerService;

import domain.Customer;

import java.util.LinkedList;
import java.util.List;

public interface CustomerService {
    List<Customer> customers = new LinkedList<>();
    void seeAllProductByCategory(int index);
    void purchaseProduct(int index, Integer howMany);
}
