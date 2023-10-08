package LessonFive.CalculateMVC.Model;

import LessonFive.CalculateMVC.Model.DivideOperation.DivideOperation;
import LessonFive.CalculateMVC.Model.MultiplyOperation.MultiplyOperation;
import LessonFive.CalculateMVC.Model.SubstractOperation.SubstractOperation;
import LessonFive.CalculateMVC.Model.SumOperation.SumOperation;

//Уровень вычислений, каждое действие выполняется отдельным классом
//Это есть вертикальный срез
public class CalculationLayer {
    public double add(double a, double b) {
        //Сложение
        SumOperation sumOperation = new SumOperation(a,b);
        return sumOperation.sum();
    }

    public double subtract(double a, double b) {
        //Вычитание
        SubstractOperation substractOperation = new SubstractOperation(a,b);
        return substractOperation.subtract();
    }

    public double multiply(double a, double b) {
        // Умножение
        MultiplyOperation multiplyOperation = new MultiplyOperation(a,b);
        return multiplyOperation.multiply();
    }

    public double divide(double a, double b) {
        DivideOperation divideOperation = new DivideOperation(a,b);
        return divideOperation.divide();
    }
}
