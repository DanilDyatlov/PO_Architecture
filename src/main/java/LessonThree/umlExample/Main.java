package LessonThree.umlExample;

// Интерфейс для View
interface CalculatorView {
    void setObserver(ViewObserver observer);
    void updateResult(double result);
    void clearScreen();
}

// Интерфейс для Observer
interface ViewObserver {
    void onCalculate(String operation, double a, double b);
    void onClear();
}

// Класс для Model
class CalculatorModel {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}

// Реализация CalculatorView
class CalculatorViewImpl implements CalculatorView {
    public void setObserver(ViewObserver observer) {
// ...
    }

    public void updateResult(double result) {
// ...
    }

    public void clearScreen() {
// ...
    }
}