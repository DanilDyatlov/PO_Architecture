package HW.HW5.CalculateMVC.Model.DivideOperation;

/**
 * Реализация метода деления.
 * Является горизонтальным слоем.
 * @pre Принимает два значения
 * @post Проводит операцию
 * @return Возвращает результат вычисления
 * */
public class DivideOperation {
    double firstArg;
    double secondArg;

    public DivideOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public double divide(){
        return firstArg/secondArg;
    }
}
