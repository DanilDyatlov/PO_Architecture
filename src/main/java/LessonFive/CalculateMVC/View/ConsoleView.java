package LessonFive.CalculateMVC.View;

import LessonFive.CalculateMVC.Model.CalculationLayer;
import LessonFive.calculate.InputOutputLayer;

public class ConsoleView implements IView {


    InputOutputLayer ioLayer;
    CalculationLayer calcLayer;

    public ConsoleView() {
        ioLayer = new InputOutputLayer();
        calcLayer = new CalculationLayer();
    }

    @Override
    public void runCalculator() {
        calcLayer.subtract(Double.parseDouble(ioLayer.getInput()), Double.parseDouble(ioLayer.getInput()));
    }
}
