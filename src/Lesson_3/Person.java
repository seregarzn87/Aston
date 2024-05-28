package Lesson_3;

/*Создать массив из 5 сотрудников Пример:
Person[] persArray = new Person[5];
Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...); ... persArray[4] = new Person(...);*/
public class Person {
    String surname, name, patronymic;
    String post;
    String email;
    String tel;
    int salary;
    byte age;

    public Person(String surname, String name, String patronymic, String post, String email, String tel, int salary, byte age) {
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

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов", "Иван", "Иванович", "Директор", "ivivan@mailbox.com", "892312312", 30000, (byte) 30);
        persArray[1] = new Person("Сидоров", "Матвей", "Ильич", "Охранник", "sidorov@mailbox.com", "892899999", 10000, (byte) 50);
        persArray[2] = new Person("Лопаткина", "Ирина", "Михайловна", "Уборщица", "lopatkina@mailbox.com", "892453224", 15000, (byte) 60);
        persArray[3] = new Person("Мурашкин", "Эдуард", "Антонович", "Бухгалтер", "murashkin@mailbox.com", "892222222", 20000, (byte) 25);
        persArray[4] = new Person("Бубликов", "Станислав", "Дмитриевич", "Специалист отдела кадров", "bublikov@mailbox.com", "89289969", 20000, (byte) 32);
        System.out.println("Список сотрудников старше 40 лет:");
        for (Person a : persArray) {
            if (a.age > 40)
                System.out.println(a);
            System.out.println();
        }
    }
}

