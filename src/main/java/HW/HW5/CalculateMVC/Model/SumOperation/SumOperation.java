package HW.HW5.CalculateMVC.Model.SumOperation;

/**
 * Реализация метода сложение.
 * Является горизонтальным слоем.
 * @pre Принимает два значения
 * @post Проводит операцию
 * @return Возвращает результат вычисления
 * */
public class SumOperation {
    public SumOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    double firstArg;
    double secondArg;

    public double sum() {
        return firstArg + secondArg;
    }
}