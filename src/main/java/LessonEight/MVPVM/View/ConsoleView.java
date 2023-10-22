package LessonEight.MVPVM.View;

import LessonEight.MVPVM.viewModel.TaskViewModel;

import java.util.List;

public class ConsoleView implements TaskView {
    // Отображает данные и передает пользовательские действия в презентер
    // Логика taskview. Реализует интерфейс и вывод данные в консоль
    @Override
    public void showTasks(List<TaskViewModel> taskViewModels) {
        for (int i = 0; i < taskViewModels.size(); i++) {
            System.out.println((i + 1) + ". " + taskViewModels.get(i).getDisplayName());
        }
    }
}
