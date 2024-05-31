package Lesson_4;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Dog extends Animal {
    public static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final int count;

    public Dog(String name) {
        super(name);
        count = COUNTER.getAndIncrement();
    }

    public int run() {
        Random random = new Random();
        int runDog = random.nextInt(0, 500);
        return runDog;
    }

    public int swim() {
        Random random = new Random();
        int swimDog = random.nextInt(0, 10);
        return swimDog;
    }

    public int countDog() {
        return count;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        dog.run(dog.run());
        dog.swim(dog.swim());
        System.out.println("Всего собак - " + dog.countDog());
    }
}
