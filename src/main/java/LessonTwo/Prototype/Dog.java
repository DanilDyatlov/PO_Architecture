package LessonTwo.Prototype;

// Конкретный класс животного (Прототип)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Реализация метода клонирования для собаки
    @Override
    public Animal clone() {
        return new Dog(this.getName());
    }
}
