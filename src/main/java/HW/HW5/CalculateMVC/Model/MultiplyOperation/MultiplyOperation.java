package HW.HW5.CalculateMVC.Model.MultiplyOperation;

/**
 * Реализация метода умножения.
 * Является горизонтальным слоем.
 * @pre Принимает два значения
 * @post Проводит операцию
 * @return Возвращает результат вычисления
 * */
public class MultiplyOperation {
    double firstArg;
    double secondArg;

    public MultiplyOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public double multiply() {
        return firstArg * secondArg;
    }
}
