package LessonTen.DAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Отличие от репозитория ДАО он работает с данными.
        // Напрямую взаимодействую, ничего не скрывая
        // Работает с определенным классом
        UserDao userDao = new InMemoryUserDao();

        userDao.add(new User(1, "Alice"));
        userDao.add(new User(2, "Bob"));

        User user = userDao.getById(1);
        System.out.println("User with ID 1: " + user.getName());

        List<User> allUsers = userDao.getAll();
        System.out.println("All Users:");
        for (User u : allUsers) {
            System.out.println(u.getId() + ": " + u.getName());
        }

        User updatedUser = new User(1, "Alicia");
        userDao.update(updatedUser);

        userDao.delete(2);
    }
}