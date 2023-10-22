package LessonEight.MVPVM.Model;

public class Task {
    // Model отвечает за бизнес логику и хранение данных и не имеет отношение ко view
    // Предсталяет данные. Это лист. Содержит информацию о задачах. Баззовая функция задачи
    // Базовая сущность. персдтавляет задачу с именами и статусом
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public void complete() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getName() {
        return name;
    }
}
