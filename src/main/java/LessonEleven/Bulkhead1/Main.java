package LessonEleven.Bulkhead1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(5);

        // Обработка транзакций разными операторами
        bank.processTransactionWithOperator(0);
        bank.processTransactionWithOperator(2);
        bank.processTransactionWithOperator(4);

        // Попытка обработать транзакцию с несуществующим оператором
        bank.processTransactionWithOperator(6); // Invalid operator index.
    }
}
