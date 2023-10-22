package LessonEight.MVVM.View;

import LessonEight.MVVM.ViewModel.BooksViewModel;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class MVVMPatternDemo {
//    // Паттерн. Основной класс для взаимодействия с пользователем. Отображает данные предоставляемся от viewmodel.
    // И отправляет команды назад в viewmodel на обработку.
    // MVVM обеспечивает разделение ответственность между различными частями, и легко изменяется логика без изменения бизнес логики.
    // Пользователь может отмечать книги как прочитаные
    // Интерфейс
//    public static void main(String[] args) {
//        List<Book> books = new ArrayList<>();
////        books.add(new Book("Властелин Колец"));
////        books.add(new Book("1984"));
////        books.add(new Book("Убить пересмешника"));
//
//        BooksViewModel viewModel = new BooksViewModel(books);
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println(viewModel.getDisplayableBooks());
//            System.out.println("Введите номер книги, чтобы отметить ее как прочитанную (или 'exit' для выхода): ");
//
//            String input = scanner.nextLine();
//            if ("exit".equalsIgnoreCase(input)) {
//                break;
//            }
//
//            try {
//                int bookId = Integer.parseInt(input) - 1;
//                viewModel.markBookAsRead(bookId);
//            } catch (NumberFormatException | IndexOutOfBoundsException e) {
//                System.out.println("Неверный ввод. Пожалуйста, введите номер книги.");
//            }
//        }
//    }
//}
