package LessonEleven.Bulkhead1;

import java.util.ArrayList;
import java.util.List;

// Класс, представляющий банк
class Bank {
    private List<BankOperator> operators = new ArrayList<>(); // Список банковских операторов

    // Конструктор, создающий банк с заданным числом операторов
    public Bank(int operatorCount) {
        for (int i = 0; i < operatorCount; i++) {
            operators.add(new BankOperator("Operator " + (i + 1)));
        }
    }

    // Метод для обработки транзакции определенным оператором
    public void processTransactionWithOperator(int operatorIndex) {
        if (operatorIndex >= 0 && operatorIndex < operators.size()) {
            BankOperator operator = operators.get(operatorIndex);
            try {
                operator.processTransaction();
            } catch (RuntimeException e) {
                System.err.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid operator index.");
        }
    }
}
