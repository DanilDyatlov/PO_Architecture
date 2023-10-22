package LessonTen.UWP;

// Пример сущности
// Напрямую связан с транзакциями и изменния данных
// Группирует дейсвтия  в одну транзакцию
class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
