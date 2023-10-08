package LessonFive.calculate;

// Горизонтальные уровни архитектуры калькулятора

// Уровень ввода и вывода
public class InputOutputLayer {
    public String getInput() {
        // Чтение ввода пользователя
        return null;
    }

    void displayOutput(String result) {
        // Вывод результата на экран
    }
}

// Уровень вычислений
class CalculationLayer {
    double add(double a, double b) {
        // Сложение
        return a;
    }

    double subtract(double a, double b) {
        // Вычитание
        return a;
    }

    double multiply(double a, double b) {
        // Умножение
        return a;
    }

    double divide(double a, double b) {
        // Деление
        return a;
    }
}

// Уровень управления
class ControlLayer {
    InputOutputLayer ioLayer;
    CalculationLayer calcLayer;

    ControlLayer() {
        ioLayer = new InputOutputLayer();
        calcLayer = new CalculationLayer();
    }

    void runCalculator() {
        String input = ioLayer.getInput();
        // Анализ ввода и управление вычислениями
        // Вывод результата с использованием ioLayer
    }
}