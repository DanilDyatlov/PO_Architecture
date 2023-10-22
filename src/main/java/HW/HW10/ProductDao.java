package HW.HW10;

import java.util.List;

public interface ProductDao<P> {
    // Класс интерфейс представляюсь возможности получения, добавления, удаления продуктов из базы данных
    Product getById(int id);
    List<Product> getAll();
    void add(Product product);
    void update(Product product);
    void delete(int id);
}
