package LessonEight.MVPVM.Presenter;

import LessonEight.MVPVM.Model.Task;
import LessonEight.MVPVM.View.TaskView;
import LessonEight.MVPVM.viewModel.TaskViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskPresenter {
    // Обработчик действий пользователя и обновление viewmodel
    // Это мост между моделью и вью. Реагирует на действия пользователя. Обвновляет модель и бизнес логику. сообщает вью об этом
    // и какие даные отобразить сообщает viewmodel
    // Содержит список задач и ссылку на вью. Имеет методы для отображения задач. Презентер создаст новый список вьюмоделей и передает во вью.
    // Контроллер приложения. Управляет данные и консольвью
    private List<Task> tasks = new ArrayList<>();
    private TaskView view;

    public TaskPresenter(TaskView view) {
        this.view = view;
        tasks.add(new Task("Помыть посуду"));
        tasks.add(new Task("Постирать белье"));
    }

    public void displayTasks() {
        List<TaskViewModel> taskViewModels = tasks.stream()
                .map(TaskViewModel::new)
                .collect(Collectors.toList());
        view.showTasks(taskViewModels);
    }

    public void completeTask(int index) {
        tasks.get(index).complete();
        displayTasks();
    }
}
