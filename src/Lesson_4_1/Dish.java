package Lesson_4_1;

public class Dish extends Cat {
    public int volumeDish;

    public Dish(String name, int volumeDish) {
        super(name);
        this.volumeDish = volumeDish;
    }

    public void fillingish() {
        String[] array = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            volumeDish = volumeDish - eatsFood;
            if (volumeDish > eatsFood) {
                System.out.println("Кот сыт");
            } else if (volumeDish < eatsFood) {
                volumeDish = volumeDish + 200;
                System.out.println("Миска пуста, необходимо наполнить миску");
            } else {
                System.out.println("Кот сыт");
            }
        }
    }

    public static void main(String[] args) {
        Dish dish = new Dish("Миска Барсика", 200);
        dish.fillingish();
    }
}
