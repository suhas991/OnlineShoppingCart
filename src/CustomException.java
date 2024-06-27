class DuplicateID extends Exception {
    public DuplicateID(String message) {
        super(message);
    }
}

class ProductNotFound extends Exception {
    public ProductNotFound(String message) {
        super(message);
    }
}
