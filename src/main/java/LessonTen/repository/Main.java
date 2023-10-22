package LessonTen.repository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Используем экземпляр и выполнение действией с пользователем. Данные хранения не затрагивается,
        // Абстрагирует данные пользователя. Полная работа с данными
        // Методы более универсальные. Высокоуровневая, скрывает откуда данные
        // Работает с любыми сущностями
        Repository<User> userRepository = new InMemoryUserRepository();

        userRepository.add(new User(1, "Alice"));
        userRepository.add(new User(2, "Bob"));

        User user = userRepository.getById(1);
        System.out.println("User with ID 1: " + user.getName());

        List<User> allUsers = userRepository.getAll();
        System.out.println("All Users:");
        for (User u : allUsers) {
            System.out.println(u.getId() + ": " + u.getName());
        }

        userRepository.update(new User(1, "Alicia"));

        userRepository.delete(2);
    }
}