package LessonSix.Patern.PaternAdapter;

// Класс Лев
class Lion {
    void roar() {
        System.out.println("Лев рычит");
    }
}

// Класс Слон
class Elephant {
    void trumpet() {
        System.out.println("Слон издает трубный звук");
    }
}

// Интерфейс, ожидаемый клиентским кодом
interface Animal {
    void makeSound();
}

// Адаптер для класса Лев
class LionAdapter implements Animal {
    private Lion lion;
    // так как адаптер ссылаемся на льва

    public LionAdapter(Lion lion) {
        // так как кдаптер вызываем льва
        this.lion = lion;
    }

    @Override
    public void makeSound() {
        lion.roar();
    }
}

// Адаптер для класса Слон
class ElephantAdapter implements Animal {
    private Elephant elephant;

    public ElephantAdapter(Elephant elephant) {
        this.elephant = elephant;
    }

    @Override
    public void makeSound() {
        elephant.trumpet();
    }
}
public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant = new Elephant();

        Animal lionAdapter = new LionAdapter(lion);
        Animal elephantAdapter = new ElephantAdapter(elephant);
        // Сущность animal для вызова адптера

        lionAdapter.makeSound();      // Вывод: Лев рычит
        elephantAdapter.makeSound();  // Вывод: Слон издает трубный звук
    }
}