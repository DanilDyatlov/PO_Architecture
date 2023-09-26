package LessonTwo.Prototype;

// Конкретный класс животного (Прототип)
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Реализация метода клонирования для кошки
    @Override
    public Animal clone() {
        return new Cat(this.getName());
    }
}
