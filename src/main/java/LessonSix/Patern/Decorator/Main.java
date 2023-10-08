package LessonSix.Patern.Decorator;

// Интерфейс для животных
interface Animal {
    void describe();
}

// Реализация базового интерфейса для животных
class BasicAnimal implements Animal {
    private String description;

    public BasicAnimal(String description) {
        this.description = description;
    }

    @Override
    public void describe() {
        System.out.println(description);
    }
}

// Декоратор для добавления цвета животным
class ColorDecorator implements Animal {
    private Animal animal;
    // сслка на изначальный класс
    private String color;

    public ColorDecorator(Animal animal, String color) {
        this.animal = animal;
        this.color = color;
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("Цвет: " + color);
    }
}

// Декоратор для добавления размера животным
class SizeDecorator implements Animal {
    private Animal animal;
    private String size;

    public SizeDecorator(Animal animal, String size) {
        // получаем ссылку
        this.animal = animal;
        this.size = size;
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("Размер: " + size);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем базового животного
        Animal basicAnimal = new BasicAnimal("Это животное");

        // Декорируем его цветом и размером
        Animal coloredAnimal = new ColorDecorator(basicAnimal, "красный");
        Animal sizedAnimal = new SizeDecorator(coloredAnimal, "большой");

        // Выводим описание животного с учетом декораций
        sizedAnimal.describe();
    }
}
