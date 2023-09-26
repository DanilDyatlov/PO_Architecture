package HW.HW1Animal;
import java.util.ArrayList;
import java.util.List;

abstract class Amphibians extends Animals {
    public Amphibians(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Amphibians: %s", super.toString());
    }
}
abstract class Animals implements Soundable {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract String sound(); // метод голос животного
    public abstract String feed(); // метод чем питается животное

    @Override
    public String toString() {
        return String.format("Name: %s, Food: %s", name, feed());
        // То что будет выводиться
    }
}
abstract class Reptiles extends Animals {
    public Reptiles(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return String.format("Reptiles: %s", super.toString());
    }
}
class Frog extends Amphibians implements SwimSpeed, Soundable {
    public Frog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "ribbit";
    }

    @Override
    public String feed() {
        return "insects";
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Frog: %s, Sound: %s, SwimSpeed: %d", super.toString(), sound(), getSwimSpeed());
    }
}
class Snake extends Reptiles implements SwimSpeed, Soundable {
    public Snake(String name) {
        super(name);
    }
    @Override
    public String sound() {
        return "Hiss";
    }
    @Override
    public String feed() {
        return "frogs, fish";
    }
    @Override
    public int getSwimSpeed() {
        return 20;
    }
    @Override
    public String toString() {
        return String.format("Snake: %s, Sound: %s, SwimSpeed: %d", super.toString(), sound(), getSwimSpeed());
    }
}
interface Soundable {
    String sound();
}
interface SwimSpeed {
    int getSwimSpeed();
}
class Terrarium {
    private List<Animals> terrarium = new ArrayList<>();

    public Terrarium addAnimals(Animals terraAmimals){
        terrarium.add(terraAmimals);
        return this;
    }

    private List<Soundable> getSoundable() {
//        List<Soundable> soundables = new ArrayList<>(terrarium);
//        return soundables;
        List<Soundable> soundables = new ArrayList<>();
        for (Animals animal : terrarium) {
            if (animal instanceof Soundable) {
                soundables.add((Soundable) animal);
            }
        }
        return soundables;
    }

    public String getSound() {
        StringBuilder builder = new StringBuilder();
        for (Soundable soundAnimal: getSoundable()) {
            builder.append(soundAnimal.sound()).append("\n");
        }
        return builder.toString();
    }

    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimmersAnimals = new ArrayList<>();
        for (Animals animals : terrarium) {
            if (animals instanceof SwimSpeed){
                swimmersAnimals.add((SwimSpeed) animals);
            }
        }
        return swimmersAnimals;
    }
    public SwimSpeed fastSwimmers(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed fastSwim = swimmers.get(0);
        for (SwimSpeed animals : swimmers) {
            if (fastSwim.getSwimSpeed() < animals.getSwimSpeed()){
                fastSwim = animals;
            }
        }
        return fastSwim;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Обратите внимание кто живет в нашем террариуме!: \n");
        for (Animals animal: terrarium) {
            builder.append(animal).append("\n");
        }
        return builder.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Animals frog = new Frog("Петр");
        Animals snake = new Snake("Аркадий");
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimals(frog).addAnimals(snake);
        System.out.println(terrarium);

        System.out.println("Что говорят животные?: ");
        System.out.println(terrarium.getSound());

        System.out.println("--- Самый быстрый участник заплыва ---");
        SwimSpeed fastSwim = terrarium.fastSwimmers();
        System.out.println(fastSwim);
        System.out.println("--- Участники турнира ---");
        for (SwimSpeed swimmers: terrarium.swimmers()) {
            System.out.println(swimmers);
        }
    }
}