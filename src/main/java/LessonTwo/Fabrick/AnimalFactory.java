package LessonTwo.Fabrick;

public class AnimalFactory {
    // Фабричный метод, который создает экземпляры подклассов Animal
    public Animal createAnimal(String animalType) {
        if ("dog".equalsIgnoreCase(animalType)) {
            return new Animal.Dog();
        } else if ("cat".equalsIgnoreCase(animalType)) {
            return new Animal.Cat();
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип животного");
        }
    }
}
