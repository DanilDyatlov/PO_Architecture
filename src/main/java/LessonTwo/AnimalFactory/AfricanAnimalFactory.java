package LessonTwo.AnimalFactory;

// Конкретная фабрика для африканских животных
class AfricanAnimalFactory implements AnimalFactory {
    @Override
    public Lion createLion() {
        return new AfricanLion();
    }

    @Override
    public Duck createDuck() {
        return new Duck();
    }
}
