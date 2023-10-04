package LessonFour.OnlineTicket;

import java.util.Date;
/**
 * Абстрактный родительский класс, представляющий билет.
 * Реализует методы TicketActions
 * @pre номер/ID маршрута
 * @pre время отправления/прибытия
 * @pre цена билета
 */
abstract class Ticket implements TicketActions {
    String routeId;
    Date departureTime;
    double price;
}
