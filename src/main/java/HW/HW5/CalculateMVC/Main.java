package HW.HW5.CalculateMVC;

import HW.HW5.CalculateMVC.View.ConsoleView;
import HW.HW5.CalculateMVC.View.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        view.runCalculator();
    }
}
