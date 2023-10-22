package HW.HW10;

public class Main {
    public static void main(String[] args) {
        UnitOfWork unitOfWork = new UnitOfWork();
        ProductService productService = new ProductService();

        Product product1 = new Product(1, "Apple");
        Product product2 = new Product(2, "Pineapple");
        Product product3 = new Product(3, "");

        unitOfWork.addNewProduct(product1);
        unitOfWork.addNewProduct(product2);
        unitOfWork.addNewProduct(product3);

        productService.addProductWithLogic(product1);
        productService.addProductWithLogic(product2);
        productService.addProductWithLogic(product3);

        System.out.println("Products (before commit): " + unitOfWork.getAllProducts());

        unitOfWork.commit();

        System.out.println("Products (after commit): " + unitOfWork.getAllProducts());

        unitOfWork.deleteProduct(product1);

        unitOfWork.commit();

        System.out.println("Products (after commit): " + unitOfWork.getAllProducts());
    }
}