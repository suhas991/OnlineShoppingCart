import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();

    }

    public void addProduct(Product product) throws DuplicateID {
        for (Product p : cart) {
            if (p.getProductId() == product.getProductId()) {
                throw new DuplicateID("Product with ID " + product.getProductId() + " already exists in the cart.");
            }
        }
        cart.add(product);
    }

    public void deleteProduct(int productId) throws ProductNotFound {
        Product productToRemove = null;
        for (Product p : cart) {
            if (p.getProductId() == productId) {
                productToRemove = p;
                break;
            }
        }
        if (productToRemove == null) {
            throw new ProductNotFound("Product with ID " + productId + " not found in the cart.");
        }
        cart.remove(productToRemove);
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Shopping cart is empty");
        } else {
            for (Product p : cart) {
                p.displayDetails();
                System.out.println();
            }
        }
    }

    public double TotalPrice() {
        double total = 0;
        for (Product p : cart) {
            total += p.getPrice();
        }
        return total;
    }
}
