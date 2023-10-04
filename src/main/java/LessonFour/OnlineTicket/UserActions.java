package LessonFour.OnlineTicket;

import java.util.Date;

/**
 * Интерфейс, определяющий действия пользователя.
 */
interface UserActions {
    boolean authorize(String username, String password);

    boolean selectRoute(String routeId, Date time);

    boolean checkTicketAvailability();

    boolean checkFunds();
}
