package LessonTwo.Adapter;

// Адаптер для класса Lion
class LionAdapter implements Soundable {
    private Lion lion; // Тут лев появляется

    public LionAdapter(Lion lion) {
        this.lion = lion;
    } // попадает в кнструктор

    @Override
    public void makeSound() { // заставляем ее говорить
        // Преобразование вызова метода makeSound() в roar()
        lion.roar();
    }
}
