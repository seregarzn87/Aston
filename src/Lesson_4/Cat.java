package Lesson_4;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Cat extends Animal {
    public static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final int count;

    public Cat(String name) {
        super(name);
        count = COUNTER.getAndIncrement();
    }

    public static int run() {
        Random random = new Random();
        int runCat = random.nextInt(0, 200);
        return runCat;
    }
    public int countCat(){
        return count;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Cat cat1 = new Cat("Джордж");
        cat.run(cat.run());
        cat1.run(cat1.run());
        System.out.println("Всего кошек - " + cat1.countCat());

    }
}
