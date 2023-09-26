package LessonTwo.Adapter;

// Адаптер для класса Duck
class DuckAdapter implements Soundable {
    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void makeSound() {
        // Преобразование вызова метода makeSound() в quack()
        duck.quack();
    }
}
