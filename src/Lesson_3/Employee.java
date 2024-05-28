package Lesson_3;

/*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.*/
public class Employee {
    String surname, name, patronymic;
    String post;
    String email;
    String tel;
    int salary;
    byte age;


    public Employee(String surname, String name, String patronymic, String post, String email, String tel, int salary, byte age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return String.format("Фамилия: %s \t\nИмя: %s \t\nОтчество: %s \t\nДолжность: %s \t\nEmail: %s \t\nНомер телефона: %s \t\nЗарплата: %d \t\nВозраст: %d \t",
                surname, name, patronymic, post, email, tel, salary, age);
    }

    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Борисенко", "Сергей", "Анатольевич", "Руководитель", "serega@email.ru", "89105232369", 100000, (byte) 37);
        employee.print();
    }

}
