//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        try {
            Product laptop = new Electronics("Laptop", 101, 999.99, 10, "BrandA", 24);
            Product shirt = new Clothing("Shirt", 102, 19.99, 50, "M", "Cotton");

            cart.addProduct(laptop);
            cart.addProduct(shirt);


            Product phone = new Electronics("Phone", 101, 499.99, 5, "BrandB", 12);
            cart.addProduct(phone);

        } catch (DuplicateID | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        cart.displayCart();

        try {
            cart.deleteProduct(102);
            cart.deleteProduct(103);
        } catch (ProductNotFound e) {
            System.out.println(e.getMessage());
        }

        cart.displayCart();
        System.out.println("Total Price: $" + cart.TotalPrice());
    }
}
