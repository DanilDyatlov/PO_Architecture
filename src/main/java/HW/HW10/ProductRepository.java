package HW.HW10;


import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements ProductDao<Product> {
    // Класс использует интерфейс для доступа к данным. Сам класс отвечает за реализацию методов.
    private List<Product> products = new ArrayList<>();
    private int nextId = 1;

    @Override
    public Product getById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(products);
    }


    @Override
    public void add(Product product) {
        product.setId(nextId++);
        products.add(product);
    }

    @Override
    public void update(Product product) {
    }

    @Override
    public void delete(int id) {
        products.removeIf(product -> product.getId() == id);
    }
}
