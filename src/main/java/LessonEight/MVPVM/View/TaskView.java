package LessonEight.MVPVM.View;

import LessonEight.MVPVM.viewModel.TaskViewModel;

import java.util.List;

public interface TaskView {
    // Интерфейс пользоватлея на вход получает лист. Отображает данные которые ему предоставляет. лОгику представляет consolview
    void showTasks(List<TaskViewModel> taskViewModels);
}
