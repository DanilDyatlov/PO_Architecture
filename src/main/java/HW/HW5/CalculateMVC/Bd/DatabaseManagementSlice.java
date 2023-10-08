package HW.HW5.CalculateMVC.Bd;

/**
 * Класс БД, который является горизонтальным слоем
 * saveData реализует сохранения данных в нашу БД
 * fetchData реализует извлечении данных из БД
 * @return Возвращает сообщение об успешном сохранении/вывод запрошенных данных
 */
public class DatabaseManagementSlice {
    void saveData(String data) {
        // Реализация сохранения данных в базу данных
        System.out.println("Сохранено в базе данных: " + data);
    }

    String fetchData() {
        // Реализация извлечения данных из базы данных
        return "Данные из базы данных";
    }
}