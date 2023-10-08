package LessonSix.Patern.сomposite;

import java.util.ArrayList;
import java.util.List;

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

// Класс для группы животных (композиция)
class AnimalGroup implements Animal {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void describe() {
        // вызываем у каждого животного метод
        for (Animal animal : animals) {
            animal.describe();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем отдельных животных
        BasicAnimal lion = new BasicAnimal("Лев");
        BasicAnimal elephant = new BasicAnimal("Слон");

        // Создаем группу животных и добавляем в нее отдельных животных
        AnimalGroup animalGroup = new AnimalGroup();
        animalGroup.addAnimal(lion);
        animalGroup.addAnimal(elephant);

        // Выводим описание отдельных животных и группы
        System.out.println("Отдельные животные:");
        lion.describe();
        elephant.describe();

        System.out.println("\nГруппа животных:");
        animalGroup.describe();
    }
    // можно вызвать весь список но вызвовется только те что есть
}