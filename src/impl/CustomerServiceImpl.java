package impl;

import domain.Category;
import domain.Product;
import ownerService.CustomerService;

import static ownerService.OwnerService.*;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void seeAllProductByCategory(int index) {
        for(Category category : categories) {
            if(category.getId() == index) {
                System.out.println(category.toString());
            }
        }
    }

    @Override
    public void purchaseProduct(int index, Integer howMany) {
        System.out.println(products);
        for(Product product : products) {
            if(product.getId() == index) {
               productsValues.remove(howMany);
            }
        }
    }
}
