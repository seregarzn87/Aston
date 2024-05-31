package Lesson_4_1;

public class Animal {
    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }

    void run(int range) {
        System.out.println("Животное умеет бегать " + range + " м");
    }

    void swim(int range) {
        System.out.println("Животное умеет плавать " + range + " м");
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        Dog druzhok = new Dog("Дружок");
        Cat dzhek = new Cat("Джек");
        Dog polkan = new Dog("Полкан");
        barsik.run(150);
        dzhek.run(201);

        druzhok.run(500);
        polkan.run(501);
        System.out.println("Всего животных: " + Animal.getCountAnimal());
        System.out.println("Всего кошек: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDod());
    }
}

