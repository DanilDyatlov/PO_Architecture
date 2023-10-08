package HW.HW5.CalculateMVC.Model.SubstractOperation;

/**
 * Реализация метода вычитание.
 * Является горизонтальным слоем.
 * @pre Принимает два значения
 * @post Проводит операцию
 * @return Возвращает результат вычисления
 * */
public class SubstractOperation {
    public SubstractOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    double firstArg;
    double secondArg;

    public double subtract() {
        return firstArg - secondArg;
    }
}
