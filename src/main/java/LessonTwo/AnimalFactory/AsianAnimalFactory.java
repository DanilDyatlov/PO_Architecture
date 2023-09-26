package LessonTwo.AnimalFactory;

// Конкретная фабрика для азиатских животных
class AsianAnimalFactory implements AnimalFactory {
    @Override
    public Lion createLion() {
        return new AsianLion();
    }

    @Override
    public Duck createDuck() {
        return new Duck();
    }
}
