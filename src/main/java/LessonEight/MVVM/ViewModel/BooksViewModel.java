package LessonEight.MVVM.ViewModel;

import java.awt.print.Book;
import java.util.List;

public class BooksViewModel {
    // Этот класс медиатор между view и model. Он получает данные из model, формирует их для отображения и предоставляем методы для обработки действия пользователя типа завершение задач
    // предоставляет представление для отображения списка книг
    private final List<Book> books;

    public BooksViewModel(List<Book> books) {
        this.books = books;
    }

    public String getDisplayableBooks() {
        StringBuilder builder = new StringBuilder("Список книг:\n");
        for (int i = 0; i < books.size(); i++) {
            builder.append((i + 1)).append(". ").append(books.get(i).toString()).append("\n");
        }
        return builder.toString();
    }

//    public void markBookAsRead(int index) {
//        books.get(index).markAsRead();
//    }
}