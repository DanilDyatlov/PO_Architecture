package LessonTwo.Fabrick;

// Абстрактный класс Animal
public abstract class Animal {
    public abstract void makeSound();

    // Подкласс Cat (кошка)
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Кошка мяукает");
        }
    }

    // Подкласс Dog (собака)
    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Собака лает");
        }
    }
}

