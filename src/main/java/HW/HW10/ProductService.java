package HW.HW10;

import java.util.List;

class ProductService {
    // Это слой сервиса. Инкапсулирует бизнес логику связанную с продуктом.
    // Продукт добавляет после проверки на бизнес логику(проверка имени)
    // Метод использует репозиторий
    public ProductRepository productRepository = new ProductRepository();

    // Метод для добавления продукта с бизнес-логикой
    public void addProductWithLogic(Product product) {
        if (product.getName() != null && !product.getName().isEmpty()) {
            productRepository.add(product);
        }
    }

    // Метод для получения всех продуктов через репозиторий
    public List<Product> getAllProducts() {
        return productRepository.getAll();
    }
}
