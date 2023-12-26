package impl;

import domain.Category;
import domain.Product;
import ownerService.OwnerService;

public class OwnerServiceImpl implements OwnerService {

    @Override
    public synchronized Category addCategory(Category category) {
        categories.add(category);
        return category;
    }

    @Override
    public synchronized Category editCategory(int index, Category category) {
        for (Category category1 : categories) {
            if(index == category1.getId()) {
                category1.setName(category.getName());
                return category;
            }
        }
        return null;
    }

    @Override
    public synchronized Product addProduct(Product product) {
        for (Category category : categories) {
            if (product.getCategory().equals(category)) {
                products.add(product);
                return product;
            }
        }
        return null;
    }

    @Override
    public synchronized Product deleteProduct(int index) {
        for (Product product : products) {
            if(product.getId() == index) {
                products.remove(product);
                return product;
            }
        }
        return null;
    }

    @Override
    public synchronized Product editProduct(int index, Product product) {
        for(Product product1 : products) {
            if(product1.getId() == index) {
                product1.setName(product.getName());
                return product;
            }
        }
        return null;
    }

    @Override
    public void showProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }


}
