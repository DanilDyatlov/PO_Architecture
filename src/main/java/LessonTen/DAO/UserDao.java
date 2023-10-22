package LessonTen.DAO;

import java.util.List;

public interface UserDao {
    User getById(int id);
    List<User> getAll();
    void add(User user);
    void update(User user);
    void delete(int id);
}
