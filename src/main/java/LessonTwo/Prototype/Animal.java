package LessonTwo.Prototype;

// Метод в копировании, создавать определенные вещи на основе существующих
// Абстрактный класс Прототипа
abstract class Animal implements Cloneable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Абстрактный метод клонирования
    public abstract Animal clone();
}
