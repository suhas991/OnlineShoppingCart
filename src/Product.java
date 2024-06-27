public class Product {
     String productName;
     int productId;
     double price;
     int quantityInStock;

    public Product(String productName, int productId, double price, int quantityInStock) {

        if (productName.isEmpty() || productId <= 0 || price < 0 || quantityInStock < 0) {
            throw new IllegalArgumentException("Product Invalid");
        }

        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }
}
