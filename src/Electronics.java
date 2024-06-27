public class Electronics extends Product{
         String brand;
         int warrantyPeriod; // in months

        public Electronics(String productName, int productId, double price, int quantityInStock, String brand, int warrantyPeriod) {
            super(productName, productId, price, quantityInStock);
            this.brand = brand;
            this.warrantyPeriod = warrantyPeriod;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Brand: " + brand);
            System.out.println("Warranty Period: " + warrantyPeriod + " months");
        }
    }
