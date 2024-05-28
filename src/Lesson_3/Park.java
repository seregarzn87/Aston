package Lesson_3;

/*Создать класс Park с внутренним классом,
с помощью объектов которого можно хранить
информацию об аттракционах, времени их работы и стоимости.*/
public class Park {
    private String title;
    private String location;

    public Park(String title, String location) {
        this.title = title;
        this.location = location;
    }

    public class Attractions {
        private String info;
        private String workingHours;
        private int price;

        public Attractions(String info, String workingHours, int price) {
            this.info = info;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void getAttractions(String info, String workingHours, int price) {
            Attractions attractions = new Attractions(info, workingHours, price);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format("Парк: %s \t\nРасположение: %s \t\n",
                title, location);
    }

    public void print() {
        System.out.print(this);
    }

    public static void main(String[] args) {
        Park park = new Park("имени Ю.А. Гагарина", "Московский район г. Рязани");
        Park.Attractions attractions = park.new Attractions("Карусель", "9.00-17.00", 200);
        park.print();
        System.out.println("Название аттракциона: " + attractions.info);
        System.out.println("Время работы: " + attractions.workingHours);
        System.out.println("Цена: " + attractions.price + " рублей");
    }

}

