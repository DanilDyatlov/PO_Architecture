package LessonEight.MVPVM.viewModel;

import LessonEight.MVPVM.Model.Task;

public class TaskViewModel {
    // Представляет состояние интерфейса и данные которые должны быть отображены
    // Формирует данные из model для отображение в view. Логика не изменяется от этого
    // Модель данных для вью. Преобразует сырые данные которые удобно нам из модели в формат удобен для отображения пользователя
    // Принимает объект такс создает отформатированный для отображения.
    // Преобразует даные из такс в формат которые удобен для отображения
    private String displayName;

    public TaskViewModel(Task task) {
        this.displayName = task.getName() + (task.isCompleted() ? " (completed)" : "");
    }

    public String getDisplayName() {
        return displayName;
    }
}
