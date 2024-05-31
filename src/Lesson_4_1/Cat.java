package Lesson_4_1;

public class Cat extends Animal {
    String name;
    static int countCat = 0;

    Cat(String name) {
        super();
        countCat++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println(name + " не может пробежать больше 200 м");
        } else {
            System.out.println(name + " может пробежать " + range + " м");
        }
    }

    @Override
    void swim(int range) {
        System.out.println("Кошка не может плавать");
    }

    static int getCountCat() {
        return countCat;
    }

}
