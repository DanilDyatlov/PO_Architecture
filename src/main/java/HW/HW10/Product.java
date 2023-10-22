package HW.HW10;

class Product {
    // Сущность продукт с атрибутами id и name
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

    public void setId(int i) {
    }
}
