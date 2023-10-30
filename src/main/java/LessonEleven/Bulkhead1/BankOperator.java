package LessonEleven.Bulkhead1;

// Класс представляет банковского оператора
class BankOperator {
    private String name;

    public BankOperator(String name) {
        this.name = name;
    }

    // Метод для обработки транзакций клиентов
    public void processTransaction() {
        // Предположим, здесь возможна ошибка при обработке транзакции.
        // В данном случае, мы выбрасываем исключение прямо в методе.
        if (Math.random() < 0.5) {
            throw new RuntimeException("Error processing transaction for " + name);
        }
        System.out.println(name + " is processing a transaction.");
    }
}
