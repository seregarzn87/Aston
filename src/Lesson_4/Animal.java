package Lesson_4;

public abstract class Animal {
    private String name;
    protected int swim;
    protected int run;
    protected int count;


    public Animal(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int run) {
        System.out.println(name + " пробежал " + run + " метров");
    }

    public void swim(int swim) {
        System.out.println(name + " проплыл " + swim + " метров");
    }


}
