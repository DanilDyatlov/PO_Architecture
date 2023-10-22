package LessonEight.MVPVM.Main;

import LessonEight.MVPVM.Presenter.TaskPresenter;
import LessonEight.MVPVM.View.ConsoleView;
import LessonEight.MVPVM.View.TaskView;

import java.util.Scanner;

public class MVPVMPatternDemo {
    // Паттерн объединяет идеи MVP и MVVM. Комбинация преимуществ обоих подходов позволяя разделить логику представления view
    // от логики взаимодействия presenter и логику представления состояния данных viewmodel от бизнес логики модели
    // Создает консольвью, такс презентер. Взаимодейству с пользователем.
    // Паттерн MVPVM специальный объект который инкапсулирует логику и данные
    public static void main(String[] args) {
        TaskView view = new ConsoleView();
        TaskPresenter presenter = new TaskPresenter(view);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            presenter.displayTasks();
            System.out.println("Введите номер задачи, чтобы отметить ее как завершенную (или 'exit' для выхода): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int taskId = Integer.parseInt(input) - 1;
                presenter.completeTask(taskId);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите номер задачи.");
            }
        }
    }
}