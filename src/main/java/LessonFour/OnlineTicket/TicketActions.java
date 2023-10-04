package LessonFour.OnlineTicket;

/**
 * Реализация интерфейса
 */
interface TicketActions {
    boolean reserveTicket();

    boolean deductFunds();

    boolean confirmPurchase();

    void updateTicketAvailability();

    boolean cancelReservation();
}
