package LessonTen.SLP;

import java.util.ArrayList;
import java.util.List;

// Пример репозитория для работы с продуктами
class ProductRepository {
    // Репозитории для работы с продуктами содержит методы
    // Метод добавлени и получение всех продуктов
    private List<Product> products = new ArrayList<>();

    // Метод для добавления продукта
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для получения всех продуктов
    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}
