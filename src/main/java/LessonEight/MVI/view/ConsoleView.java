package LessonEight.MVI.view;

import LessonEight.MVI.model.TasksViewState;
import LessonEight.MVI.model.ViewState;
import LessonEight.MVI.model.*;


public class ConsoleView implements BaseView {

    @Override
    public void render(ViewState state) {
        if (state instanceof TasksViewState) {
            TasksViewState tasksState = (TasksViewState) state;
            System.out.println(tasksState);
        } else {
            System.out.println("Неизвестное состояние.");
        }
    }
}
