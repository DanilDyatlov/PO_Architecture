package LessonTwo.Adapter;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты Lion и Duck
        Lion lion = new Lion();
        Duck duck = new Duck();

        // Создаем адаптеры для Lion и Duck
        Soundable lionAdapter = new LionAdapter(lion); // через адаптер получаем животных
        Soundable duckAdapter = new DuckAdapter(duck);

        // Клиентский код ожидает объекты с интерфейсом Animal,
        // но может использовать адаптеры для вызова метода makeSound()
        lionAdapter.makeSound(); // Вывод: Lion roars!
        duckAdapter.makeSound(); // Вывод: Duck quacks!
    }
}