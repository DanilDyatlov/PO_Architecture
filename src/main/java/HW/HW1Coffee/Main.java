package HW.HW1Coffee;

import java.util.ArrayList;
import java.util.List;

class CoffeeDrinkProduct {
    private String name;
    private double volume;
    private double price;

    public CoffeeDrinkProduct(String name, double volume, double price){
        this.name = name;
        this.volume = volume;
        this.price = price;
        // Инициализировали переменные в классе.
    }
    /*
    Создаем методы для получения данных
    */
    public String getTypeName(){
        return name;
    }

    public double getVolume(){
        return volume;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString() {
        return String.format("Кофе: %s, Цена: %f, Объем: %f",  name, volume, price);
        /*Прописываем строку для вывода */
    }
}
class CoffeeMachine {
    private List<CoffeeDrinkProduct> drinksList = new ArrayList<>();
    private double cash = 0;

    public CoffeeMachine addDrinks(CoffeeDrinkProduct coffee){
        drinksList.add(coffee);
        return this;
        // Метод добавления продуктов. Drink - класс, drinksList - название списка
        // Из класса Drink подтягиваем данные и добавляем их к нашему списку
    }
    public CoffeeDrinkProduct findCoffeeProduct(String name){
        for (CoffeeDrinkProduct coffeeType : drinksList){
            // if (name.equals(coffeeType.getTypeName())){
            //    return coffeeType;
            //}
            if (coffeeType.getTypeName().equals(name)){
                return coffeeType;
            }
        }
        return null;
        // Метод поиска продукта в автомате. coffeeType переменная
    }

    public double getCash() {
        return cash;
        // Получение денег
    }

    public CoffeeDrinkProduct saleCoffee(String name){
        CoffeeDrinkProduct foundedAndSale = findCoffeeProduct(name);
        if(foundedAndSale != null) {
            cash = cash + foundedAndSale.getPrice();
            drinksList.remove(foundedAndSale);
        }
        return foundedAndSale;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        /*Показывает баланс и наличие кофе*/
        builder.append("Баланс: ").append(cash).append("\n");
        builder.append("Кофе в ассортименте: ").append(cash).append("\n");
        /*Перебор ассортимента*/
        for (CoffeeDrinkProduct coffeeType:drinksList){
            builder.append(coffeeType.toString()).append("\n");
        }
        return builder.toString();
    }
}
class HotDrinkType extends CoffeeDrinkProduct {
    private int temperature;

    public HotDrinkType(String name, double volume, double price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
        // Определили переменные, super это ссылка на коревые классы. Определили температуру.
    }

    @Override
    public String toString() {
        return String.format("%s, Температура: %d °C", super.toString(),  temperature);
        // добавили к основной строке с помощью super.toString()показатель температуры
    }
}
public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addDrinks(new HotDrinkType("Эспрессо", 0.4, 100, 80))
                .addDrinks(new HotDrinkType("Американо", 0.5, 90, 75))
                .addDrinks(new HotDrinkType("Капучино", 0.3, 140, 60))
                .addDrinks(new HotDrinkType("Латте", 0.3, 135, 60))
                .addDrinks(new HotDrinkType("Раф", 0.3, 150, 70));

        System.out.println("Добро пожаловать! Готовы сделать заказ? Мы можем вам предложить: ");
        System.out.println(coffeeMachine);

        System.out.println("Подготовка напитка...");
        System.out.println(coffeeMachine.saleCoffee("Эспрессо"));

        System.out.println("Добро пожаловать! Готовы сделать заказ? Мы можем вам предложить: ");
        System.out.println(coffeeMachine);
    }
}