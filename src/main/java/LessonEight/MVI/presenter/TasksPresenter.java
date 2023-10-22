package LessonEight.MVI.presenter;

import LessonEight.MVI.model.Intent;
import LessonEight.MVI.model.Task;
import LessonEight.MVI.model.TaskCompletedIntent;
import LessonEight.MVI.model.*;
import LessonEight.MVI.view.BaseView;
import LessonEight.MVI.model.TasksViewState;

import java.util.ArrayList;
import java.util.List;

/**
 * Presenter связывает Model и View, обрабатывая намерения и обновляя состояние представления.
 */
public class TasksPresenter {
    private final List<Task> tasks = new ArrayList<>();
    private final BaseView view;

    public TasksPresenter(BaseView view) {
        // Это мост между вью и моделью, который обрабатывает намеренья пользователя.
        // Обновляет модель и сообщает вью
        this.view = view;
        tasks.add(new Task("Помыть посуду"));
        tasks.add(new Task("Постирать белье"));
    }

    public void dispatch(Intent intent) {
        if (intent instanceof TaskCompletedIntent) {
            int taskId = ((TaskCompletedIntent) intent).getTaskId();
            tasks.get(taskId).complete();
        }
        view.render(new TasksViewState(tasks));
    }

    public void loadTasks() {
        view.render(new TasksViewState(tasks));
    }
}
