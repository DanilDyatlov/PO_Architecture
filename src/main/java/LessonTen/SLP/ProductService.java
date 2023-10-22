package LessonTen.SLP;

import java.util.List;

// Пример сервисного слоя для бизнес-логики
class ProductService {
    // Ключевой.
    // Это слой сервиса. Инкапсулирует бизнес логику связаный с продуктов.
    // Продукт добавляет после проверки на бизнес логику(проверка имени)
    private ProductRepository productRepository = new ProductRepository();

    // Метод для добавления продукта с бизнес-логикой
    public void addProductWithLogic(Product product) {
        if (product.getName() != null && !product.getName().isEmpty()) {
            productRepository.addProduct(product);
        }
    }

    // Метод для получения всех продуктов через репозиторий
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
}
