package LessonFive.CalculateMVC;

import LessonFive.CalculateMVC.View.ConsoleView;
import LessonFive.CalculateMVC.View.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        view.runCalculator();
    }
}
